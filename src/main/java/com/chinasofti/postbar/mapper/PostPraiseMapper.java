package com.chinasofti.postbar.mapper;

import com.chinasofti.postbar.dto.PostPraise;
import com.chinasofti.postbar.dto.PostPraiseExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PostPraiseMapper {
    long countByExample(PostPraiseExample example);

    int deleteByExample(PostPraiseExample example);

    int deleteByPrimaryKey(String poPrUUID);

    int insert(PostPraise record);

    int insertSelective(PostPraise record);

    List<PostPraise> selectByExample(PostPraiseExample example);

    PostPraise selectByPrimaryKey(String poPrUUID);

    int updateByExampleSelective(@Param("record") PostPraise record, @Param("example") PostPraiseExample example);

    int updateByExample(@Param("record") PostPraise record, @Param("example") PostPraiseExample example);

    int updateByPrimaryKeySelective(PostPraise record);

    int updateByPrimaryKey(PostPraise record);
}