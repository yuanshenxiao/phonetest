package com.wym.demophoneinfo.service;

import com.wym.demophoneinfo.dao.RepliesMapper;
import com.wym.demophoneinfo.pojo.Replies;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RepliesServiceImpl implements RepliesService {

    @Resource
    private RepliesMapper repliesMapper;


    @Override
    public List<Replies> findRepliesByInfoId(Long infoId) {
        return repliesMapper.findRepliesByInfoId(infoId);
    }

    @Override
    public int insertReplies(Replies replies) {
        return repliesMapper.insertReplies(replies);
    }
}
