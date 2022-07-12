package com.xunfeng.application.baguaxunfeng.service;

import com.xunfeng.application.baguaxunfeng.domain.dto.*;
import com.xunfeng.application.baguaxunfeng.domain.vo.*;

public interface DocService {

    void save(DocSaveDto dto);

    void modify(DocModifyDto dto);

    void delete(Long id);

    void page(DocPageDto dto);

    void detail(Long id);

}