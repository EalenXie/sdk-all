package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/14 17:22
 */
@Getter
@Setter
public class ChargeItem {

    /**
     * 费用金额
     */
    @JsonProperty("amount")
    private BigDecimal amount;
    /**
     * 币种
     */
    @JsonProperty("currencyCode")
    private String currencyCode;
    /**
     * 费用名称
     */
    @JsonProperty("chargeName")
    private String chargeName;
}
