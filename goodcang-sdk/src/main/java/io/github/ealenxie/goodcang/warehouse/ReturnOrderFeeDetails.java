package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 15:37
 */
@Getter
@Setter
public class ReturnOrderFeeDetails {
    /**
     * 运输费
     */
    @JsonProperty("shipping_fee")
    private Double shippingFee;
    /**
     * 操作费用
     */
    @JsonProperty("operating_fee")
    private Integer operatingFee;
    /**
     * 燃油附加费
     */
    @JsonProperty("fuel_surcharge")
    private Double fuelSurcharge;
    /**
     * 其它费用
     */
    @JsonProperty("other_fee")
    private Double otherFee;
    /**
     * 币别
     */
    @JsonProperty("currency_code")
    private String currencyCode;
}
