package lyon.controller;

import lyon.entity.SysUserEntity;
import lyon.service.SysUserService;
import lyon.util.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ExportXls {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("export")
    public ModelAndView exportXls(){
      return ExcelUtils.export("用户信息统计报表", SysUserEntity.class,sysUserService.list());
}
}
