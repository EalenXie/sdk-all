package io.github.ealenxie.wish.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 10:42
 */
@Getter
@Setter
public class PaymentInvoicesQueryParams {
    /**
     * limit
     */
    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer limit;
    /**
     * sort_by
     */
    @JsonProperty("sort_by")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortBy;

    /**
     * payment_released_at_max
     */
    @JsonProperty("payment_released_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String paymentReleasedAtMax;
    /**
     * payment_released_at_min
     */
    @JsonProperty("payment_released_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String paymentReleasedAtMin;

}
