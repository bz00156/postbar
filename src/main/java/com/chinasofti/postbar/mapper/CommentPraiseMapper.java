package com.chinasofti.postbar.mapper;

import com.chinasofti.postbar.dto.CommentPraise;
import com.chinasofti.postbar.dto.CommentPraiseExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CommentPraiseMapper {
    long countByExample(CommentPraiseExample example);

    int deleteByExample(CommentPraiseExample example);

    int deleteByPrimaryKey(String cmPrUUID);

    int insert(CommentPraise record);

    int insertSelective(CommentPraise record);

    List<CommentPraise> selectByExample(CommentPraiseExample example);

    CommentPraise selectByPrimaryKey(String cmPrUUID);

    int updateByExampleSelective(@Param("record") CommentPraise record, @Param("example") CommentPraiseExample example);

    int updateByExample(@Param("record") CommentPraise record, @Param("example") CommentPraiseExample example);

    int updateByPrimaryKeySelective(CommentPraise record);

    int updateByPrimaryKey(CommentPraise record);
}