package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/4 16:58
 **/
@Getter
@Setter
public class ProcessForecastActivityRules {

    /**
     * 节点ID，暂无使用场景
     */
    private String activityId;
    /**
     * 节点名称
     */
    private String activityName;
    /**
     * 规则类型，取值：
     * target_select：自选审批人节点
     * target_approval：指定审批人节点
     */
    private String activityType;
    /**
     * 是否为自选审批节点。
     * activityType 值为target_select时，该字段值为true
     */
    private Boolean isTargetSelect;
    /**
     * 流程中前一个节点的 id
     */
    private String prevActivityId;
    /**
     * 节点操作人信息
     */
    private ProcessForecastWorkflowActor workflowActor;
}

