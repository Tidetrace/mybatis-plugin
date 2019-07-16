package com.ck.mybatisplugin.demo.dao;

import com.ck.mybatisplugin.demo.domain.SysResource;
import org.springframework.stereotype.Repository;

@Repository
public interface SysResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysResource record);

    int insertSelective(SysResource record);

    SysResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") SysResource record);

    int updateByPrimaryKey(SysResource record);
}