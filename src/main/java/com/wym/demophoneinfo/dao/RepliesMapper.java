package com.wym.demophoneinfo.dao;

import com.wym.demophoneinfo.pojo.Replies;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepliesMapper {

    //根据资讯id查询回复
    List<Replies> findRepliesByInfoId(@Param("infoId") Long infoId);

    //添加回复
    int insertReplies(Replies replies);
}
