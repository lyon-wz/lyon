package lyon.common;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import lyon.dao.SysDictDao;
import lyon.entity.SysDict;
import lyon.service.SysDictService;
import org.jeecgframework.dict.service.AutoPoiDictServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class AutoPoiDictService implements AutoPoiDictServiceI {

    @Autowired
    private SysDictService sysDictService;

    /**
     * 通过字典翻译字典文本
     *
     * @Author wz
     */
    @Override
    public String[] queryDict(String dicTable, String dicCode, String dicText) {
        List<String> dictReplaces = new ArrayList<>();
        List<SysDict> dictList =sysDictService.list ();
        for (SysDict t : dictList) {
            if (t != null) {
                dictReplaces.add(t.getName() + "_" + t.getType());
            }
        }
        if (dictReplaces != null && dictReplaces.size() != 0) {
            return dictReplaces.toArray(new String[dictReplaces.size()]);
        }
        return null;
    }
}