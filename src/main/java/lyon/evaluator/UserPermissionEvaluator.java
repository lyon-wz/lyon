package lyon.evaluator;

import lyon.activemq.Producer;
import lyon.entity.SelfUserEntity;
import lyon.entity.SysMenuEntity;
import lyon.service.SysUserService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.jms.Destination;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 自定义权限注解验证
 * @Author wz
 * @CreateTime 2020/8/12
 */
@Component
public class UserPermissionEvaluator implements PermissionEvaluator {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private Producer producer;
    /**
     * hasPermission鉴权方法
     * 这里仅仅判断PreAuthorize注解中的权限表达式
     * 实际中可以根据业务需求设计数据库通过targetUrl和permission做更复杂鉴权
     * @Author wz
     * @CreateTime 2020/8/12
     * @Param  authentication 用户身份
     * @Param  targetUrl 请求路径
     * @Param  permission 请求路径权限
     * @Return boolean 是否通过
     */
    @Override
    @Cacheable
    public boolean hasPermission(Authentication authentication, Object targetUrl, Object permission) {
        // 获取用户信息
        SelfUserEntity selfUserEntity =(SelfUserEntity) authentication.getPrincipal();
        // 查询用户权限(这里可以将权限放入缓存中提升效率)

        Set<String> permissions =(Set<String>) redisTemplate.opsForValue().get(selfUserEntity.getUserId());
        if(CollectionUtils.isEmpty(permissions)){
            permissions=new HashSet<>();
            List<SysMenuEntity> sysMenuEntityList = sysUserService.selectSysMenuByUserId(selfUserEntity.getUserId());
            for (SysMenuEntity sysMenuEntity:sysMenuEntityList) {
                permissions.add(sysMenuEntity.getPermission());
                redisTemplate.opsForValue().set(selfUserEntity.getUserId( ),permissions);
            }
            System.out.println("从数据库中获取。。。。。。。。。。");


        }
        Destination destination = new ActiveMQQueue("first.queue");
        producer.sendMessage(destination,permissions.toString());
        // 权限对比
        if (permissions.contains(permission.toString())){
            return true;
        }
        return false;
    }
    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        return false;
    }
}