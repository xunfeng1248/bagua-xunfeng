package com.xunfeng.application.baguaxunfeng.service;

import com.xunfeng.application.baguaxunfeng.domain.dto.*;
import com.xunfeng.application.baguaxunfeng.domain.vo.*;

public interface CatalogService {

    void save(CatalogSaveDto dto);

    void modify(CatalogModifyDto dto);

    void delete(Long id);

}