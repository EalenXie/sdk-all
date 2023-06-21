package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/4 16:49
 **/
@Getter
@Setter
public class ProcessForecastResponseBodyResult {


    /**
     * 是否预测成功，成功返回true
     */
    private Boolean isForecastSuccess;

    /**
     * 是否静态流程。
     * true：
     * false：
     */
    private Boolean isStaticWorkflow;

    /**
     * 表单的唯一码
     */
    private String processCode;

    /**
     * 流程ID，暂无使用场景
     */
    private Long processId;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 工作流节点规则
     */
    private List<ProcessForecastActivityRules> workflowActivityRules;

    /**
     * 工作流节点流
     */
    private List<ProcessForecastForecastNodes> workflowForecastNodes;
}

