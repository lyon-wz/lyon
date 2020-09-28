package lyon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lyon.entity.SysUserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 用户与角色关系DAO
 * @Author wz
 * @CreateTime 2020/8/12
 */
@Mapper
public interface SysUserRoleDao extends BaseMapper<SysUserRoleEntity> {
	
}
