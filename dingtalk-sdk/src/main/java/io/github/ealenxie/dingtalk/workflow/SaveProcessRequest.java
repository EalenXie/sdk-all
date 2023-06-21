package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/8 15:06
 **/
@Getter
@Setter
public class SaveProcessRequest {
    /**
     * 表单ProcessCode，更新表单模板时需指定ProcessCode
     * 未填写该参数，表示新建一个模板
     * 填写该参数，表示更新所传值对应的审批模板
     */
    private String description;
    /**
     *
     */
    private List<FormComponent> formComponents;
    /**
     * 表单模板名称
     */
    private String name;
    /**
     * 表单模板描述
     */
    private String processCode;
    /**
     * 流程中心集成配置
     */
    private SaveProcessFeatureConfig processFeatureConfig;

    /**
     * 流程中心模板配置
     *
     * @deprecated (钉钉标记删除)
     */
    @Deprecated
    public SaveProcessRequestTemplateConfig templateConfig;

}

