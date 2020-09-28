package lyon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lyon.entity.SysRoleMenuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色权限关系DAO
 * @Author wz
 * @CreateTime 2020/8/12
 */
@Mapper
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenuEntity> {
	
}
