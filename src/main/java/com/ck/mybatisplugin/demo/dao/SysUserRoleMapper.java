package com.ck.mybatisplugin.demo.dao;

import com.ck.mybatisplugin.demo.domain.SysUserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}