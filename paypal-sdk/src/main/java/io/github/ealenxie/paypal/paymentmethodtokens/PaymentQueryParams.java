package io.github.ealenxie.paypal.paymentmethodtokens;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 16:11
 * @version 1.0
 */
@Getter
@Setter
public class PaymentQueryParams extends PageQueryParams {

    /**
     * customerId
     */
    @JsonProperty("customer_id")
    private String customerId;

}
