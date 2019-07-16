package com.ck.mybatisplugin.demo.domain;

import java.util.Date;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class SysRoleResource {
    /** 主键ID */
    private Integer id;

    /** 角色ID */
    private Integer roleId;

    /** 资源ID */
    private Integer resourceId;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}