package lyon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import lyon.dao.SysRoleDao;
import lyon.entity.SysRoleEntity;
import lyon.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * @Description 角色业务实现
 * @Author wz
 * @CreateTime 2020/8/12
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

}