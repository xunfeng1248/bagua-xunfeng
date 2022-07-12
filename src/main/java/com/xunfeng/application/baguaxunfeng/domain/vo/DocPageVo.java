package com.xunfeng.application.baguaxunfeng.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
* DocPageVo
*
* @author cst
* @date 2022年7月12日 上午8:48:34
*/
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocPageVo {

        /**
        * 
        */
        private Long id;
        /**
        * 文档标题
        */
        private String title;
        /**
        * 文档内容
        */
        private String content;
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