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
public class Fulfillment {
    /**
     * lineItemAttributesList
     */
    @JsonProperty("lineItemAttributesList")
    private List<LineItemAttribute> lineItemAttributesList;
    /**
     * sla
     */
    @JsonProperty("sla")
    private Sla sla;
    /**
     * accessMode
     */
    @JsonProperty("accessMode")
    private AccessMode accessMode;
    /**
     * fulfillmentTime
     */
    @JsonProperty("fulfillmentTime")
    private FulfillmentTime fulfillmentTime;
    /**
     * fulfillmentId
     */
    @JsonProperty("fulfillmentId")
    private String fulfillmentId;
    /**
     * nodeType
     */
    @JsonProperty("nodeType")
    private String nodeType;
}
