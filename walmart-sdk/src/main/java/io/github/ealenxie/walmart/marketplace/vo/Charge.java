package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/04 12:31
 */
@Getter
@Setter
public class Charge {
    /**
     * 收费类型 PRODUCT or SHIPPING
     */
    @JsonProperty("chargeType")
    private String chargeType;
    @JsonProperty("chargeAmount")
    private ChargeAmount chargeAmount;
    @JsonProperty("tax")
    private Tax tax;
    /**
     * If chargeType is PRODUCT, chargeName is Item Price.
     * If chargeType is SHIPPING, chargeName is Shipping
     */
    @JsonProperty("chargeName")
    private String chargeName;
}
