package com.ck.mybatisplugin.demo.dao;

import com.ck.mybatisplugin.demo.domain.SysAccountLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysAccountLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAccountLog record);

    int insertSelective(SysAccountLog record);

    SysAccountLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") SysAccountLog record);

    int updateByPrimaryKey(SysAccountLog record);
}