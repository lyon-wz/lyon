package lyon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lyon.dao.SysDictDao;
import lyon.entity.SysDict;
import lyon.service.SysDictService;
import org.springframework.stereotype.Service;

@Service
public class SysDictServiceImpl extends ServiceImpl<SysDictDao, SysDict> implements SysDictService {
}
