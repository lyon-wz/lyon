package lyon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import lyon.entity.SysMenuEntity;
import lyon.entity.SysRoleEntity;
import lyon.entity.SysUserEntity;

import java.util.List;

/**
 * @Description 系统用户业务接口
 * @Author wz
 * @CreateTime 2020/8/12
 */
public interface SysUserService extends IService<SysUserEntity>  {

    /**
     * 根据用户名查询实体
     * @Author wz
     * @CreateTime 2020/8/12
     * @Param  username 用户名
     * @Return SysUserEntity 用户实体
     */
    SysUserEntity selectUserByName(String username);
    /**
     * 根据用户ID查询角色集合
     * @Author wz
     * @CreateTime 2020/8/12
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);
    /**
     * 根据用户ID查询权限集合
     * @Author wz
     * @CreateTime 2020/8/12
     * @Param  userId 用户ID
     * @Return List<SysMenuEntity> 角色名集合
     */
    List<SysMenuEntity> selectSysMenuByUserId(Long userId);

}