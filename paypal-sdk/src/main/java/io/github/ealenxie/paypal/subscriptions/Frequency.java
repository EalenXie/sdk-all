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
public class Frequency {
    /**
     * intervalUnit
     */
    @JsonProperty("interval_unit")
    private String intervalUnit;
    /**
     * intervalCount
     */
    @JsonProperty("interval_count")
    private Integer intervalCount;
}
