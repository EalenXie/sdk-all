package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 13:41
 */
@Getter
@Setter
public class FulfillmentOption {
    /**
     * fulfillments
     */
    @JsonProperty("fulfillments")
    private List<Fulfillment> fulfillments;
    /**
     * fulfillmentMode
     */
    @JsonProperty("fulfillmentMode")
    private String fulfillmentMode;
    /**
     * accessType
     */
    @JsonProperty("accessType")
    private String accessType;
    /**
     * isDefault
     */
    @JsonProperty("isDefault")
    private Boolean isDefault;
    /**
     * fulfillmentType
     */
    @JsonProperty("fulfillmentType")
    private String fulfillmentType;
}
