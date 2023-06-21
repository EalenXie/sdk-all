package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/4 15:15
 **/
@Getter
@Setter
public class QuerySchemaByProcessCodeItemsPropsPush {
    /**
     * 考勤类型，取值：
     * 1：请假
     * 2：出差
     * 3：加班
     * 4：外出
     */
    private Integer attendanceRule;
    /**
     * 开启状态，取值：
     * <p>
     * 1：开启
     * <p>
     * 0：关闭
     */
    private Integer pushSwitch;
    /**
     * 状态显示名称
     */
    private String pushTag;
}

