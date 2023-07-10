package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 13:41
 */
@NoArgsConstructor
@Data
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
