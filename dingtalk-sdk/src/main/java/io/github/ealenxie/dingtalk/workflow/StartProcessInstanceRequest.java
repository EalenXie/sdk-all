package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/6 15:16
 **/

@Getter
@Setter
public class StartProcessInstanceRequest {


    /**
     * 审批发起人的userId
     */
    private String originatorUserId;
    /**
     * 审批流的唯一码
     * process_code在审批模板编辑页面的URL中获取
     */
    private String processCode;
    /**
     * 审批发起人所在的部门ID
     */
    private String deptId;
    /**
     * 应用标识AgentId，获取方式：
     * 企业内部应用，详情参见基础概念。
     * 第三方企业应用，详情参见基础概念。
     */
    private String microappAgentId;
    /**
     * 不使用审批流模板时，直接指定的审批人列表，最大列表长度：20
     */
    private List<StartProcessInstanceRequestApprovers> approvers;
    /**
     * 抄送人 userId
     */
    private List<String> ccList;
    /**
     * 抄送时间点，取值：
     * START：开始时抄送
     * FINISH：结束时抄送
     * START_FINISH：开始和结束时都抄送
     */
    private String ccPosition;
    /**
     * 使用审批流模板时，流程预测结果中节点规则上必填的自选操作人列表，最大列表长度：20
     */
    private List<StartProcessInstanceRequestTargetSelectActioners> targetSelectActioners;
    /**
     * 表单数据内容，控件列表，最大列表长度：150
     */
    private List<FormComponentValues> formComponentValues;

}

