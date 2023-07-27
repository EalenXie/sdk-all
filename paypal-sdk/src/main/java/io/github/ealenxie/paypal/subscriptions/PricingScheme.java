package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/18 15:11
 * @version 1.0
 */
@Getter
@Setter
public class PricingScheme {
    /**
     * fixedPrice
     */
    @JsonProperty("fixed_price")
    private Money fixedPrice;
    /**
     * version
     */
    @JsonProperty("version")
    private Integer version;
    /**
     * createTime
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * updateTime
     */
    @JsonProperty("update_time")
    private String updateTime;
}
