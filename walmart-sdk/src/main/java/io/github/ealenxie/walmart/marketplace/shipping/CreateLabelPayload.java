package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 10:37
 */
@Getter
@Setter
public class CreateLabelPayload {

    /**
     * packageType
     */
    @JsonProperty("packageType")
    private String packageType;
    /**
     * boxDimensions
     */
    @JsonProperty("boxDimensions")
    private BoxDimensions boxDimensions;
    /**
     * boxItems
     */
    @JsonProperty("boxItems")
    private List<BoxItem> boxItems;
    /**
     * fromAddress
     */
    @JsonProperty("fromAddress")
    private CreateLabelFromAddress fromAddress;
    /**
     * purchaseOrderId
     */
    @JsonProperty("purchaseOrderId")
    private String purchaseOrderId;
    /**
     * carrierName
     */
    @JsonProperty("carrierName")
    private String carrierName;
    /**
     * carrierServiceType
     */
    @JsonProperty("carrierServiceType")
    private String carrierServiceType;
}
