package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 11:38
 */
@Getter
@Setter
public class ShipNodePayload {
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    private String shipNode;
    /**
     * shipNodeName
     */
    @JsonProperty("shipNodeName")
    private String shipNodeName;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * timeZone
     */
    @JsonProperty("timeZone")
    private String timeZone;
    /**
     * distributorSupportedServices
     */
    @JsonProperty("distributorSupportedServices")
    private List<String> distributorSupportedServices;
    /**
     * customNodeId
     */
    @JsonProperty("customNodeId")
    private String customNodeId;
    /**
     * postalAddress
     */
    @JsonProperty("postalAddress")
    private PostalAddress postalAddress;
    /**
     * shippingDetails
     */
    @JsonProperty("shippingDetails")
    private List<ShippingDetail> shippingDetails;
}
