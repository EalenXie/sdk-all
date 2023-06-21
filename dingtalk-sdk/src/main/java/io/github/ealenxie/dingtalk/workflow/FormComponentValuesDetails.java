package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/4 16:27
 **/
@Getter
@Setter
public class FormComponentValuesDetails {

    /**
     * 控件别名
     */
    private String bizAlias;

    /**
     * 应用搭建隔离信息
     */
    private List<FormComponentValuesDetailsInfo> details;
    /**
     * 控件扩展值
     */
    private String extValue;
    /**
     * 控件id
     */
    private String id;
    /**
     * 控件名称
     */
    private String name;
    /**
     * 控件值
     */
    private String value;
}

