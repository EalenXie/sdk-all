package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 15:21
 */
@NoArgsConstructor
@Data
public class InventoryLog {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * fcName
     */
    @JsonProperty("fcName")
    private String fcName;
    /**
     * changedUnits
     */
    @JsonProperty("changedUnits")
    private Integer changedUnits;
    /**
     * transactionTime
     */
    @JsonProperty("transactionTime")
    private String transactionTime;
    /**
     * transactionLocation
     */
    @JsonProperty("transactionLocation")
    private String transactionLocation;
    /**
     * transactionReasonCode
     */
    @JsonProperty("transactionReasonCode")
    private String transactionReasonCode;
    /**
     * transactionReasonDesc
     */
    @JsonProperty("transactionReasonDesc")
    private String transactionReasonDesc;
    /**
     * transactionType
     */
    @JsonProperty("transactionType")
    private String transactionType;
    /**
     * shipmentId
     */
    @JsonProperty("shipmentId")
    private String shipmentId;
}
