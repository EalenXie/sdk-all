package io.github.ealenxie.paypal.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 结帐选项
 * <p>
 * By Ashe
 */
@Getter
@Setter
public class CheckoutOption {

    /**
     * 结帐操作名称
     */
    @JsonProperty("checkout_option_name")
    private String checkoutOptionName;

    /**
     * 结帐操作值
     */
    @JsonProperty("checkout_option_value")
    private String checkoutOptionValue;
}
