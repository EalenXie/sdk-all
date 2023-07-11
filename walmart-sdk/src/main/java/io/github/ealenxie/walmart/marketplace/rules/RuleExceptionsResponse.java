package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 9:48
 */
@Getter
@Setter
public class RuleExceptionsResponse {
    /**
     * skuIds
     */
    @JsonProperty("skuIds")
    private List<String> skuIds;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
