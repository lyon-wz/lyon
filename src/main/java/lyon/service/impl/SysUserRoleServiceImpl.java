package lyon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lyon.dao.SysUserRoleDao;
import lyon.entity.SysUserRoleEntity;
import lyon.service.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * @Description 用户与角色业务实现
 * @Author wz
 * @CreateTime 2020/8/12
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {

}