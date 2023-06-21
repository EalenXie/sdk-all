package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/6 15:25
 **/
@Getter
@Setter
public class StartProcessInstanceRequestApprovers {
    /**
     * 审批类型，取值：
     * AND：会签
     * OR：或签
     * NONE：单人审批
     */
    private String actionType;
    /**
     * 审批人 userId。 例如：["user001","user002"]
     */
    private List<String> userIds;
}

