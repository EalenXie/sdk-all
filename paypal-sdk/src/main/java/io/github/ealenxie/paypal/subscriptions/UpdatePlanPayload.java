package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/18 16:00
 * @version 1.0
 */
@Getter
@Setter
public class UpdatePlanPayload {

    /**
     * op
     */
    @JsonProperty("op")
    private String op;
    /**
     * path
     */
    @JsonProperty("path")
    private String path;
    /**
     * value
     */
    @JsonProperty("value")
    private Integer value;
}
