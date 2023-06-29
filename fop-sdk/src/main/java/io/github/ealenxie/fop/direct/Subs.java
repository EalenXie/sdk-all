package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/16 10:13
 */
@Getter
@Setter
public class Subs {
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 费用项金额
     */
    @JsonProperty("fee_amount")
    private String feeAmount;
    /**
     * 费用项名称
     */
    @JsonProperty("fee_name")
    private String feeName;
}
