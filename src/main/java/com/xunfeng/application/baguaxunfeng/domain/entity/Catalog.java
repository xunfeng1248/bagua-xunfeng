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
public class Catalog {

    /**
     * 
     */
    private Long id;
    /**
     * 栏目编码, 全局唯一
     */
    private String code;
    /**
     * 栏目父编码,设置顶级栏目为[root]
     */
    private String parentCode;
    /**
     * 栏目名称
     */
    private String name;
    /**
     * 栏目状态, 1 - 上线 0 - 草稿, 默认上线
     */
    private Integer state;
    /**
     * 栏目描述
     */
    private String description;
    /**
     * 是否删除, 1 - 是 0 - 否, 默认0
     */
    private Integer isDelete;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date modifyTime;
}