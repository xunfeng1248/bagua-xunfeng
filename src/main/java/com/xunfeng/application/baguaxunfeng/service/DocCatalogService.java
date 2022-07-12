package com.xunfeng.application.baguaxunfeng.service;

import com.xunfeng.application.baguaxunfeng.domain.dto.*;
import com.xunfeng.application.baguaxunfeng.domain.vo.*;

public interface DocCatalogService {

    void save(DocCatalogSaveDto dto);

    void modify(DocCatalogModifyDto dto);

    void delete(Long id);

}