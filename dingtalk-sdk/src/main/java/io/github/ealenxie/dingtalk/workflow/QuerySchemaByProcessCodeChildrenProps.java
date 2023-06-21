package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/4 15:29
 **/
@Getter
@Setter
public class QuerySchemaByProcessCodeChildrenProps {
    /**
     * 控件业务别名
     */
    private String bizAlias;
    /**
     * 控件id
     */
    private String id;
    /**
     * 控件名称
     */
    private String label;
    /**
     * 是否必填
     */
    private Boolean required;
}

