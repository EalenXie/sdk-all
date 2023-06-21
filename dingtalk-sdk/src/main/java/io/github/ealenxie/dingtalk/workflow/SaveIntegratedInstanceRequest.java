package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/9 10:39
 **/
@Getter
@Setter
public class SaveIntegratedInstanceRequest {
    /**
     * 审批模板code。
     * 企业内部应用，通过调用获取模板code接口获取processCode参数值。
     * 第三方企业应用，通过调用获取模板code接口获取processCode参数值。
     */
    private String processCode;
    /**
     * 审批发起人的userId
     */
    private String originatorUserId;
    /**
     * 表单控件列表
     */
    private List<FormComponentValuesDetailsInfo> formComponentValueList;
    /**
     * 实例标题
     */
    private String title;
    /**
     * 第三方审批系统中审批单详情页地址
     */
    private String url;
    /**
     * 抄送信息列表
     */
    private List<SaveIntegratedInstanceNotifiers> notifiers;
}

