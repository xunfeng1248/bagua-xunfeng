package com.xunfeng.application.baguaxunfeng.controller;

import com.xunfeng.application.baguaxunfeng.domain.dto.*;
import com.xunfeng.application.baguaxunfeng.domain.vo.*;
import com.xunfeng.application.baguaxunfeng.service.CatalogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * CatalogController
 *
 * @author cst
 * @date 2022年7月12日 上午8:48:34
 */
@Slf4j
@RestController
@RequestMapping(value = "/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @RequestMapping(value = "/catalogs", method = RequestMethod.POST)
    public void save(@RequestBody @Validated CatalogSaveDto dto) {
    }

    @RequestMapping(value = "/catalogs/{id}", method = RequestMethod.PUT)
    public void modify(@PathVariable(value = "id") Long id, @RequestBody @Validated CatalogModifyDto dto) {
    }

    @RequestMapping(value = "/catalogs/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id) {
    }

}