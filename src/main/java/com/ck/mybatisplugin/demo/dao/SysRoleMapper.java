package com.ck.mybatisplugin.demo.dao;

import com.ck.mybatisplugin.demo.domain.SysRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") SysRole record);

    int updateByPrimaryKey(SysRole record);
}