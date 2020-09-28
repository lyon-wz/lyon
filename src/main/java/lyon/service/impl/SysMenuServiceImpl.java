package lyon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lyon.dao.SysMenuDao;
import lyon.entity.SysMenuEntity;
import lyon.service.SysMenuService;
import org.springframework.stereotype.Service;

/**
 * @Description 权限业务实现
 * @Author wz
 * @CreateTime 2020/8/12
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

}