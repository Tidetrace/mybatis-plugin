package com.ck.mybatisplugin.demo.domain;

import java.util.Date;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class SysAccountLog {
    /** 用户账户操作日志主键 */
    private Integer id;

    /** 日志名称(login,register,logout) */
    private String logName;

    /** 用户名 */
    private String username;

    /** 创建时间 */
    private Date createTime;

    /** 是否执行成功(0失败1成功) */
    private Byte succeed;

    /** 具体消息 */
    private String message;

    /** 登录ip */
    private String ip;
}