package lyon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lyon.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 角色DAO
 * @Author wz
 * @CreateTime 2020/8/14
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

}