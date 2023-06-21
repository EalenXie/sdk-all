package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 表单组件列表
 *
 * @author lanzhi
 * Created on 2023/4/28 10:30
 **/
@Getter
@Setter
public class FormComponent {
    /**
     * 明细中的子控件列表，子控件列表遵循各控件属性标准
     */
    private List<FormComponent> children;
    /**
     * 选项显示名称
     */
    private String componentType;
    /**
     * 选项显示名称
     */
    private FormComponentProps props;
}

