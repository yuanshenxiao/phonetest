package com.wym.demophoneinfo.service;

import com.wym.demophoneinfo.dao.InformationsMapper;
import com.wym.demophoneinfo.pojo.Informations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class InformationServiceImpl implements InformationsService{

    @Resource
    private InformationsMapper informationsMapper;

    @Override
    public List<Informations> findInformationList() {
        return informationsMapper.findInformationList();
    }

    @Override
    public Informations findinformationById(Long id) {
        return informationsMapper.findinformationById(id);
    }

    @Override
    public int updateInfoCount(Long id) {
        return informationsMapper.updateInfoCount(id);
    }

    @Override
    public int updateInfoReplyCount(Long id, Date lastPostTime) {
        return informationsMapper.updateInfoReplyCount(id,lastPostTime);
    }
}
