package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 15:10
 */
@NoArgsConstructor
@Data
public class Shipment {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * statusDescription
     */
    @JsonProperty("statusDescription")
    private String statusDescription;
    /**
     * purchaseOrderId
     */
    @JsonProperty("purchaseOrderId")
    private String purchaseOrderId;
    /**
     * scac
     */
    @JsonProperty("scac")
    private String scac;
    /**
     * trackingNo
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * externalTrackingURL
     */
    @JsonProperty("externalTrackingURL")
    private String externalTrackingURL;
    /**
     * shipmentNo
     */
    @JsonProperty("shipmentNo")
    private String shipmentNo;
    /**
     * actualShipmentDate
     */
    @JsonProperty("actualShipmentDate")
    private String actualShipmentDate;
    /**
     * packageASN
     */
    @JsonProperty("packageASN")
    private String packageASN;
    /**
     * carrierDescription
     */
    @JsonProperty("carrierDescription")
    private String carrierDescription;
    /**
     * carrierServiceCode
     */
    @JsonProperty("carrierServiceCode")
    private String carrierServiceCode;
    /**
     * packageId
     */
    @JsonProperty("packageId")
    private String packageId;
    /**
     * lastModified
     */
    @JsonProperty("lastModified")
    private String lastModified;
    /**
     * shipmentLines
     */
    @JsonProperty("shipmentLines")
    private List<ShipmentLine> shipmentLines;
    /**
     * shipmentDates
     */
    @JsonProperty("shipmentDates")
    private List<ShipmentDate> shipmentDates;
}
