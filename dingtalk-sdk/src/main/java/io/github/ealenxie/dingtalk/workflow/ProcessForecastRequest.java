package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/4 15:51
 **/
@Getter
@Setter
public class ProcessForecastRequest {
    /**
     * 应用搭建隔离信息
     */
    private String requestId;
    /**
     * 审批流的唯一码。
     * process_code在审批模板编辑页面的URL中获取
     */
    private String processCode;
    /**
     * 即将发起审批单的员工所在部门ID
     */
    private String deptId;
    /**
     * 即将发起审批单的员工userId值
     */
    private String userId;
    /**
     * 表单数据内容，控件列表，最大列表长度：150
     */
    private List<FormComponentValues> formComponentValues;


}

