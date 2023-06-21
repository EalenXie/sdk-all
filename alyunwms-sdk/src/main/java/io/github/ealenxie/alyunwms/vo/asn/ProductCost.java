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
public class ProductCost {
    /**
     * 总成本
     */
    @JsonProperty("total_cost")
    private String totalCost;
    /**
     * 头程成本
     */
    @JsonProperty("head_cost")
    private String headCost;
    /**
     * 运输费
     */
    @JsonProperty("shipping_cost")
    private String shippingCost;
    /**
     * 报关费
     */
    @JsonProperty("ccf_cost")
    private String ccfCost;
    /**
     * 关税
     */
    @JsonProperty("dt_cost")
    private String dtCost;
    /**
     * 其他费用
     */
    @JsonProperty("other_cost")
    private String otherCost;
    /**
     * 客户币种
     */
    @JsonProperty("customer_currency")
    private String customerCurrency;
}
