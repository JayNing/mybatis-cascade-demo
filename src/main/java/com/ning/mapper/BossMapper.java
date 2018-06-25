package com.ning.mapper;

import com.ning.entity.Boss;

public interface BossMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Boss record);

    int insertSelective(Boss record);

    Boss selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Boss record);

    int updateByPrimaryKey(Boss record);
}