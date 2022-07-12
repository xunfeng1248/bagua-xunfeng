package com.xunfeng.application.baguaxunfeng.service.impl;

import com.xunfeng.application.baguaxunfeng.domain.dto.*;
import com.xunfeng.application.baguaxunfeng.domain.vo.*;
import com.xunfeng.application.baguaxunfeng.domain.entity.*;
import com.xunfeng.application.baguaxunfeng.mapper.DocCatalogMapper;
import com.xunfeng.application.baguaxunfeng.service.DocCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocCatalogServiceImpl implements DocCatalogService {

    @Autowired
    private DocCatalogMapper docCatalogMapper;

    @Override
    public void save(DocCatalogSaveDto dto) {

    }

    @Override
    public void modify(DocCatalogModifyDto dto) {

    }

    @Override
    public void delete(Long id) {

    }

}