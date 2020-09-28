package lyon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lyon.entity.SysDict;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysDictDao extends BaseMapper<SysDict> {
}
