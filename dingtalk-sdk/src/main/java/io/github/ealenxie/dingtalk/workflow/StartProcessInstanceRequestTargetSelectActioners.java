package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/6 15:26
 **/
@Getter
@Setter
public class StartProcessInstanceRequestTargetSelectActioners {
    /**
     * 使用审批流模板时，流程预测结果中节点规则上必填的自选操作人列表，最大列表长度：20
     */
    private String actionerKey;
    /**
     * 使用审批流模板时，流程预测结果中节点规则上必填的自选操作人列表，最大列表长度：20
     */
    private List<String> actionerUserIds;
}

