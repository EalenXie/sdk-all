package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/6 15:53
 **/
@Getter
@Setter
public class StartProcessInstanceResponseBody {
    /**
     * 审批实例id
     */
    private String instanceId;
}

