package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/18 15:03
 * @version 1.0
 */
@Getter
@Setter
public class Taxes {
    /**
     * percentage
     */
    @JsonProperty("percentage")
    private String percentage;
    /**
     * inclusive
     */
    @JsonProperty("inclusive")
    private Boolean inclusive;
}
