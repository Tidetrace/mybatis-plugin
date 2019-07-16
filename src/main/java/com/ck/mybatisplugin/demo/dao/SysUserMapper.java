package com.ck.mybatisplugin.demo.dao;

import com.ck.mybatisplugin.demo.domain.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(@Param("record") SysUser record);

    int updateByPrimaryKey(SysUser record);
}