package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 12:23
 */
@Getter
@Setter
public class Billing {
    @JsonProperty("consignment_no")
    private String consignmentNo;
    @JsonProperty("billing_type")
    private String billingType;
    @JsonProperty("deduction_type")
    private String deductionType;
    @JsonProperty("billing_date")
    private String billingDate;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("billing_amount")
    private String billingAmount;
}
