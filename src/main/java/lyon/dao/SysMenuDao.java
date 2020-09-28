package lyon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import lyon.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 权限DAO
 * @Author wz
 * @CreateTime 2020/8/12
 */
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {

}