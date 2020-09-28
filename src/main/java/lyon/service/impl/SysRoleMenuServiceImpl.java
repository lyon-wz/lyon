package lyon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import lyon.dao.SysRoleMenuDao;
import lyon.entity.SysRoleMenuEntity;
import lyon.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * @Description 角色与权限业务实现
 * @Author wz
 * @CreateTime 2020/8/12
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

}