package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 14:27
 */
@Getter
@Setter
public class ActivationStatusResponse {

    /**
     * activationStatus
     */
    @JsonProperty("activationStatus")
    private String activationStatus;
    /**
     * modifiedDate
     */
    @JsonProperty("modifiedDate")
    private Long modifiedDate;
    /**
     * createdDate
     */
    @JsonProperty("createdDate")
    private Long createdDate;
}
