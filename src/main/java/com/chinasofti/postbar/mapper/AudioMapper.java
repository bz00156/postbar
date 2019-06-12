package com.chinasofti.postbar.mapper;

import com.chinasofti.postbar.dto.Audio;
import com.chinasofti.postbar.dto.AudioExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AudioMapper {
    long countByExample(AudioExample example);

    int deleteByExample(AudioExample example);

    int deleteByPrimaryKey(String auSetUUID);

    int insert(Audio record);

    int insertSelective(Audio record);

    List<Audio> selectByExample(AudioExample example);

    Audio selectByPrimaryKey(String auSetUUID);

    int updateByExampleSelective(@Param("record") Audio record, @Param("example") AudioExample example);

    int updateByExample(@Param("record") Audio record, @Param("example") AudioExample example);

    int updateByPrimaryKeySelective(Audio record);

    int updateByPrimaryKey(Audio record);
}