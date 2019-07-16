package com.ck.mybatisplugin.demo.domain;

import java.util.Date;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class sysOperationLog {
    /** 用户操作日志主键 */
    private Integer id;

    /** 日志名称 */
    private String logName;

    /** 用户id */
    private String userId;

    /** api名称 */
    private String api;

    /** 方法名称 */
    private String method;

    /** 创建时间 */
    private Date createTime;

    /** 是否执行成功(0失败1成功) */
    private Byte succeed;

    /** 具体消息备注 */
    private String message;
}