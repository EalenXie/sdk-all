package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/8 10:31
 **/
@Getter
@Setter
public class GetProcessInstanceOperationRecords {
    /**
     * 操作人userId
     */
    private String userId;
    /**
     * 操作时间
     */
    private String date;
    /**
     * 操作类型
     * EXECUTE_TASK_NORMAL：正常执行任务
     * EXECUTE_TASK_AGENT：代理人执行任务
     * APPEND_TASK_BEFORE：前加签任务
     * APPEND_TASK_AFTER：后加签任务
     * REDIRECT_TASK：转交任务
     * START_PROCESS_INSTANCE：发起流程实例
     * TERMINATE_PROCESS_INSTANCE：终止(撤销)流程实例
     * FINISH_PROCESS_INSTANCE：结束流程实例
     * ADD_REMARK：添加评论
     * REDIRECT_PROCESS：审批退回
     * PROCESS_CC：抄送
     */
    private String type;
    /**
     * 操作结果。
     * AGREE：同意
     * REFUSE：拒绝
     * NONE：未处理
     */
    private String result;
    /**
     * 评论内容
     */
    private String remark;
    /**
     * 评论附件列表
     */
    private List<GetProcessInstanceAttachments> attachments;
    /**
     * 抄送人userIds列表
     */
    private List<String> ccUserIds;
}

