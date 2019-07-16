package com.ck.mybatisplugin.demo.domain;

import java.util.Date;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class SysUserRole {
    /** 用户角色关联表主键 */
    private Integer id;

    /** 用户UID */
    private String userId;

    /** 角色ID */
    private Integer roleId;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}