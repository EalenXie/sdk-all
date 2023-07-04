package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 15:51
 * @version 1.0
 */
@Getter
@Setter
public class ChargePayload {
    /**
     * 费用金额
     */
    @JsonProperty("amount")
    private Double amount;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 费用名称
     */
    @JsonProperty("chargeName")
    private String chargeName;
}
