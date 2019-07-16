package com.ck.mybatisplugin.demo.dao;

import com.ck.mybatisplugin.demo.domain.sysOperationLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface sysOperationLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysOperationLog record);

    int insertSelective(sysOperationLog record);

    sysOperationLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") sysOperationLog record);

    int updateByPrimaryKey(sysOperationLog record);
}