package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 11:05
 */
@Getter
@Setter
public class StateSubregion {
    /**
     * stateSubregionCode
     */
    @JsonProperty("stateSubregionCode")
    private String stateSubregionCode;
    /**
     * stateSubregionName
     */
    @JsonProperty("stateSubregionName")
    private String stateSubregionName;
}
