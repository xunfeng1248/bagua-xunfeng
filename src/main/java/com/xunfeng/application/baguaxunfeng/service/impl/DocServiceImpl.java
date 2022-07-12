package com.xunfeng.application.baguaxunfeng.service.impl;

import com.xunfeng.application.baguaxunfeng.domain.dto.*;
import com.xunfeng.application.baguaxunfeng.domain.vo.*;
import com.xunfeng.application.baguaxunfeng.domain.entity.*;
import com.xunfeng.application.baguaxunfeng.mapper.DocMapper;
import com.xunfeng.application.baguaxunfeng.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocServiceImpl implements DocService {

    @Autowired
    private DocMapper docMapper;

    @Override
    public void save(DocSaveDto dto) {

    }

    @Override
    public void modify(DocModifyDto dto) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void page(DocPageDto dto) {

    }

    @Override
    public void detail(Long id) {

    }

}