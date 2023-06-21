package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/4 11:15
 **/
@Getter
@Setter
public class QuerySchemaByProcessCodeSchemaContent {
    /**
     * 图标
     */
    private String icon;
    /**
     * 控件列表
     */
    private List<QuerySchemaByProcessCodeItems> items;
    /**
     * 表单名称
     */
    private String title;
}

