package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Capital {
    /**
     * 认缴金额
     */
    @JsonProperty("amomon")
    private String amomon;

    /**
     * 认缴方式
     */
    @JsonProperty("paymet")
    private String paymet;

    /**
     * 认缴时间
     */
    @JsonProperty("time")
    private String time;

    /**
     * 占比
     */
    @JsonProperty("percent")
    private String percent;
}