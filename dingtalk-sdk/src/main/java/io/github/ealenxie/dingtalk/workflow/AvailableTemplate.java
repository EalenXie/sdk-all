package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/4/28 13:31
 **/
@Getter
@Setter
public class AvailableTemplate {
    /**
     * 可关联的审批表单名称
     */
    private String name;
    /**
     * 可关联的审批表单formCode
     */
    private String processCode;
}

