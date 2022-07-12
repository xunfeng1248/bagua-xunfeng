package com.xunfeng.application.baguaxunfeng.service.impl;

import com.xunfeng.application.baguaxunfeng.domain.dto.*;
import com.xunfeng.application.baguaxunfeng.domain.vo.*;
import com.xunfeng.application.baguaxunfeng.domain.entity.*;
import com.xunfeng.application.baguaxunfeng.mapper.CatalogMapper;
import com.xunfeng.application.baguaxunfeng.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private CatalogMapper catalogMapper;

    @Override
    public void save(CatalogSaveDto dto) {

    }

    @Override
    public void modify(CatalogModifyDto dto) {

    }

    @Override
    public void delete(Long id) {

    }

}