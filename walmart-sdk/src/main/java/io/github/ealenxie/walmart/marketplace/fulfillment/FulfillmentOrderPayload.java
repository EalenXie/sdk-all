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
public class FulfillmentOrderPayload {
    /**
     * sellerOrderId
     */
    @JsonProperty("sellerOrderId")
    private String sellerOrderId;
    /**
     * orderType
     */
    @JsonProperty("orderType")
    private String orderType;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * orderDate
     */
    @JsonProperty("orderDate")
    private String orderDate;
    /**
     * buyerInfo
     */
    @JsonProperty("buyerInfo")
    private BuyerInfo buyerInfo;
    /**
     * shipments
     */
    @JsonProperty("shipments")
    private List<Shipment> shipments;
    /**
     * orderLines
     */
    @JsonProperty("orderLines")
    private List<OrderLine> orderLines;
}
