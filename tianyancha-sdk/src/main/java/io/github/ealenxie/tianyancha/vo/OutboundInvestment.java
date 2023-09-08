package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutboundInvestment {
    /**
     * 对外投资企业名称
     */
    @JsonProperty("outcompanyName")
    private String outcompanyName;

    /**
     * 年报年度
     */
    @JsonProperty("reportYear")
    private String reportYear;

    /**
     * 统一信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;

    /**
     * 注册号
     */
    @JsonProperty("regNum")
    private String regNum;

    /**
     * 对外投资企业的cid
     */
    @JsonProperty("clickId")
    private String clickId;

    /**
     * 类型，1-人，2-公司
     */
    @JsonProperty("type")
    private String type;
}