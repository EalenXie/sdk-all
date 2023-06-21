package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/4 17:05
 **/
@Getter
@Setter
public class ProcessForecastActorSelectionRange {
    /**
     * 审批指定成员。
     */
    private List<ProcessForecastApprovals> approvals;
    /**
     * 审批指定角色
     */
    private List<ProcessForecastLabels> labels;
}

