package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/8 13:28
 **/
@Getter
@Setter
public class GetProcessInstanceTasks {

    /**
     * 任务ID
     */
    private Integer taskId;
    /**
     * 任务处理人
     */
    private String userId;
    /**
     * 任务状态。
     * NEW：未启动
     * RUNNING：处理中
     * PAUSED：暂停
     * CANCELED：取消
     * COMPLETED：完成
     * TERMINATED：终止
     */
    private String status;
    /**
     * 结果。
     * AGREE：同意
     * REFUSE：拒绝
     * REDIRECTED：转交
     */
    private String result;
    /**
     * 开始时间
     */
    private String createTime;
    /**
     * 结束时间
     */
    private String finishTime;
    /**
     * 移动端任务URL
     */
    private String mobileUrl;
    /**
     * PC端任务URL
     */
    private String pcUrl;
    /**
     * 实例ID
     */
    private String processInstanceId;
    /**
     * 任务节点ID
     */
    private String activityId;
}

