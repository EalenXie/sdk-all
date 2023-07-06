package io.github.ealenxie.paypal.tracking;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/19 11:23
 */
@Getter
@Setter
public class TrackerPayload {
    /**
     * transactionId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("transaction_id")
    private String transactionId;
    /**
     * trackingNumber
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tracking_number")
    private String trackingNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("carrier_name_other")
    private String carrierNameOther;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("notify_buyer")
    private Boolean notifyBuyer;
    /**
     * status
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("status")
    private String status;
    /**
     * carrier
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("carrier")
    private String carrier;
    /**
     * shipmentDirection
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("shipment_direction")
    private String shipmentDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("shipment_date")
    private String shipmentDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tracking_number_type")
    private String trackingNumberType;

}
