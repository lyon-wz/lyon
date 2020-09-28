package lyon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;;
import lyon.entity.SysMenuEntity;
import lyon.entity.SysRoleEntity;
import lyon.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @Description 系统用户DAO
 * @Author wz
 * @CreateTime 2020/8/12
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {

    /**
     * 通过用户ID查询角色集合
     * @Author wz
     * @CreateTime 2020/8/12
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);
    /**
     * 通过用户ID查询权限集合
     * @Author wz
     * @CreateTime 2020/8/12
     * @Param  userId 用户ID
     * @Return List<SysMenuEntity> 角色名集合
     */
    List<SysMenuEntity> selectSysMenuByUserId(Long userId);
	
}
