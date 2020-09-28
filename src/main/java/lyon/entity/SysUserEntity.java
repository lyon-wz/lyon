package lyon.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;

/**
 * 系统用户实体
 * @Author wz
 * @CreateTime 2020/8/12
 */
@Data
@TableName("sys_user")
public class SysUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 用户ID
	 */
	@TableId
	private Long userId;
	/**
	 * 用户名
	 */
    @Excel(name = "用户名", width = 15)
	private String username;

    /**
     * 性别  1:男  0:女
     */
    @Excel(name = "性别", width = 15,dicCode ="type")
    @TableField("gender")
    private Integer gender;

	/**
	 * 密码
	 */
	private String password;
	/**
	 * 状态:NORMAL正常  PROHIBIT禁用
	 */
    @Excel(name = "状态", width = 15)
	private String status;
}