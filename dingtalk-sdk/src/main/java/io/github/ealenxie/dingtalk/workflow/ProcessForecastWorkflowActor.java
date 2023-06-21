package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;


/**
 * @author lanzhi
 * Created on 2023/5/4 17:02
 **/
@Getter
@Setter
public class ProcessForecastWorkflowActor {

    /**
     * 节点操作人 key
     */
    private String actorKey;
    /**
     * 节点操作人类型，取值：
     * approver：审批人
     * notifier：抄送人
     * audit：办理人
     */
    private String actorType;
    /**
     * 节点操作人选择范围类型，取值：
     * allStaff：全公司
     * approvals：指定成员
     * labels：角色
     */
    private String actorSelectionType;
    /**
     * 节点操作人选择范围
     */
    private ProcessForecastActorSelectionRange actorSelectionRange;
    /**
     * 是否允许多选，还是仅允许选一人
     */
    private Boolean allowedMulti;
    /**
     * 节点审批类型，取值：
     * MANUAL：人工审批
     * AUTO_AGREE：自动通过
     * AUTO_REFUSE：自动拒绝
     */
    private String approvalType;
    /**
     * 节点审批方式，取值：
     * ONE_BY_ONE：依次审批
     * AND：会签审批
     * OR：或签审批
     */
    private String approvalMethod;
    /**
     * 节点激活类型，取值：
     * ALL：并行
     * ONE_BY_ONE：串行
     */
    private String actorActivateType;
    /**
     * 该审批人节点在发起审批时是否必填
     */
    private Boolean required;
}

