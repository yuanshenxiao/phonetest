package com.wym.demophoneinfo.service;

import com.wym.demophoneinfo.pojo.Replies;

import java.util.List;

public interface RepliesService {


    //根据资讯id查询回复
    List<Replies> findRepliesByInfoId(Long infoId);

    //添加回复
    int insertReplies(Replies replies);
}
