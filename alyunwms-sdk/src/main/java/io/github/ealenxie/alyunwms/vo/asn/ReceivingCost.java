package io.github.ealenxie.alyunwms.vo.asn;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/22 16:56
 * @version 1.0
 */
@Getter
@Setter
public class ReceivingCost {
    @JsonProperty("total_cost")
    private String totalCost;
    @JsonProperty("shipping_cost")
    private String shippingCost;
    @JsonProperty("ccf_cost")
    private String ccfCost;
    @JsonProperty("dt_cost")
    private String dtCost;
    @JsonProperty("other_cost")
    private String otherCost;
    @JsonProperty("customer_currency")
    private String customerCurrency;
}
