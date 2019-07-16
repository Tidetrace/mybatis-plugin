package com.ck.mybatisplugin.demo.domain;

import java.util.Date;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class SysRole {
    /** 角色ID */
    private Integer id;

    /** 角色编码 */
    private String code;

    /** 角色名称 */
    private String name;

    /** 状态   1:正常、9：禁用 */
    private Short status;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}