package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/4 15:17
 **/
@Getter
@Setter
public class QuerySchemaByProcessCodeStatField {
    /**
     * id 值
     */
    private String id;
    /**
     * 名称
     */
    private String label;
    /**
     * 单位
     */
    private String unit;
    /**
     * 是否大写，取值：
     * true：是
     * false：否
     */
    private Boolean upper;
}

