package com.xunfeng.application.baguaxunfeng.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author cst
 * @date 2022年7月12日 上午8:48:34
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocCatalog {

    /**
     * 
     */
    private Long id;
    /**
     * 文档id
     */
    private Long docId;
    /**
     * 栏目id
     */
    private Long catalogId;
    /**
     * 
     */
    private Integer isDelete;
    /**
     * 
     */
    private Date createTime;
    /**
     * 
     */
    private Date modifyTime;
}