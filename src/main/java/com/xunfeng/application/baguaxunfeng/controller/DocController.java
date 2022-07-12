package com.xunfeng.application.baguaxunfeng.controller;

import com.xunfeng.application.baguaxunfeng.domain.dto.*;
import com.xunfeng.application.baguaxunfeng.domain.vo.*;
import com.xunfeng.application.baguaxunfeng.service.DocService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * DocController
 *
 * @author cst
 * @date 2022年7月12日 上午8:48:34
 */
@Slf4j
@RestController
@RequestMapping(value = "/doc")
public class DocController {

    @Autowired
    private DocService docService;

    @RequestMapping(value = "/docs", method = RequestMethod.POST)
    public void save(@RequestBody @Validated DocSaveDto dto) {
    }

    @RequestMapping(value = "/docs/{id}", method = RequestMethod.PUT)
    public void modify(@PathVariable(value = "id") Long id, @RequestBody @Validated DocModifyDto dto) {
    }

    @RequestMapping(value = "/docs/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id) {
    }

    @RequestMapping(value = "/docs:page", method = RequestMethod.GET)
    public void page(DocPageDto dto) {
    }

    @RequestMapping(value = "/docs/{id}", method = RequestMethod.GET)
    public void detail(@PathVariable(value = "id") Long id) {
    }
}