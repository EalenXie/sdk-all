package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/8 10:09
 **/
@Getter
@Setter
public class GetProcessInstanceResult {
    /**
     * 审批实例标题
     */
    private String title;
    /**
     * 结束时间
     */
    private String finishTime;
    /**
     * 发起人的userId
     */
    private String originatorUserId;
    /**
     * 发起人的部门，-1表示根部门
     */
    private String originatorDeptId;
    /**
     * 发起人的部门名称
     */
    private String originatorDeptName;
    /**
     * 审批状态
     * NEW：新创建
     * RUNNING：审批中
     * TERMINATED：被终止
     * COMPLETED：完成
     * CANCELED：取消
     */
    private String status;
    /**
     * 审批人userId
     */
    private List<String> approverUserIds;
    /**
     * 抄送人userId
     */
    private List<String> ccUserIds;
    /**
     * 审批结果
     * agree：同意
     * refuse：拒绝
     */
    private String result;
    /**
     * 审批实例业务编号
     */
    private String businessId;
    /**
     * 操作记录列表
     */
    private List<GetProcessInstanceOperationRecords> operationRecords;
    /**
     * 任务列表
     */
    private List<GetProcessInstanceTasks> tasks;
    /**
     * 审批实例业务动作。
     * MODIFY：表示该审批实例是基于原来的实例修改而来
     * REVOKE：表示该审批实例是由原来的实例撤销后重新发起的
     * NONE：表示正常发起
     */
    private String bizAction;
    /**
     * 审批附属实例
     */
    private List<String> attachedProcessInstanceIds;
    /**
     * 主流程实例标识
     */
    private String mainProcessInstanceId;
    /**
     * 表单组件详情列表
     */
    private List<FormComponentValuesDetailsInfo> formComponentValues;
    /**
     * 创建时间
     */
    private String createTime;
}

