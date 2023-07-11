package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 15:25
 */
@Getter
@Setter
public class InboundShipmentItemPayload {
    /**
     * inboundOrderId
     */
    @JsonProperty("inboundOrderId")
    private String inboundOrderId;
    /**
     * shipmentId
     */
    @JsonProperty("shipmentId")
    private String shipmentId;
    /**
     * gtin
     */
    @JsonProperty("gtin")
    private String gtin;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * itemDesc
     */
    @JsonProperty("itemDesc")
    private String itemDesc;
    /**
     * itemQty
     */
    @JsonProperty("itemQty")
    private Integer itemQty;
    /**
     * vendorPackQty
     */
    @JsonProperty("vendorPackQty")
    private Integer vendorPackQty;
    /**
     * innerPackQty
     */
    @JsonProperty("innerPackQty")
    private Integer innerPackQty;
    /**
     * receivedQty
     */
    @JsonProperty("receivedQty")
    private Integer receivedQty;
    /**
     * damagedQty
     */
    @JsonProperty("damagedQty")
    private Integer damagedQty;
    /**
     * fillRate
     */
    @JsonProperty("fillRate")
    private Integer fillRate;
    /**
     * expectedDeliveryDate
     */
    @JsonProperty("expectedDeliveryDate")
    private String expectedDeliveryDate;
    /**
     * updatedExpectedDeliveryDate
     */
    @JsonProperty("updatedExpectedDeliveryDate")
    private String updatedExpectedDeliveryDate;
}
