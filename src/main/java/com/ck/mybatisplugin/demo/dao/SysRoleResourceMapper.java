package com.ck.mybatisplugin.demo.dao;

import com.ck.mybatisplugin.demo.domain.SysRoleResource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleResource record);

    int insertSelective(SysRoleResource record);

    SysRoleResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") SysRoleResource record);

    int updateByPrimaryKey(SysRoleResource record);
}