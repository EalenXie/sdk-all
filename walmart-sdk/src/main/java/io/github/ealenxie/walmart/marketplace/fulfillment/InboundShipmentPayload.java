package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 14:03
 */
@Getter
@Setter
public class InboundShipmentPayload {
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
     * shipToAddress
     */
    @JsonProperty("shipToAddress")
    private ShipToAddress shipToAddress;
    /**
     * returnAddress
     */
    @JsonProperty("returnAddress")
    private ShipToAddress returnAddress;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * createdDate
     */
    @JsonProperty("createdDate")
    private String createdDate;
    /**
     * shipmentUnits
     */
    @JsonProperty("shipmentUnits")
    private Integer shipmentUnits;
    /**
     * receivedUnits
     */
    @JsonProperty("receivedUnits")
    private Integer receivedUnits;
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
    /**
     * trackingNo
     */
    @JsonProperty("trackingNo")
    private List<String> trackingNo;
    /**
     * carrierName
     */
    @JsonProperty("carrierName")
    private String carrierName;
    /**
     * movedShipmentId
     */
    @JsonProperty("movedShipmentId")
    private String movedShipmentId;
}
