package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EquityChange {
    /**
     * 股权变更日期
     */
    @JsonProperty("changeTime")
    private String changeTime;

    /**
     * 变更前股权比例
     */
    @JsonProperty("ratioBefore")
    private String ratioBefore;

    /**
     * 变更后股权比例
     */
    @JsonProperty("ratioAfter")
    private String ratioAfter;

    /**
     * 股东（发起人）
     */
    @JsonProperty("investorName")
    private String investorName;
}
