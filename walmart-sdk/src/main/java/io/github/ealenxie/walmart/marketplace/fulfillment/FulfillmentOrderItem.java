package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 11:23
 */
@NoArgsConstructor
@Data
public class FulfillmentOrderItem {
    /**
     * sellerLineId
     */
    @JsonProperty("sellerLineId")
    private String sellerLineId;
    /**
     * fulfillmentType
     */
    @JsonProperty("fulfillmentType")
    private String fulfillmentType;
    /**
     * shippingMethod
     */
    @JsonProperty("shippingMethod")
    private String shippingMethod;
    /**
     * itemDetail
     */
    @JsonProperty("itemDetail")
    private ItemDetail itemDetail;
    /**
     * qty
     */
    @JsonProperty("qty")
    private Qty qty;
    /**
     * shippingTo
     */
    @JsonProperty("shippingTo")
    private ShippingTo shippingTo;
    /**
     * chargeDetails
     */
    @JsonProperty("chargeDetails")
    private List<ChargeDetail> chargeDetails;
}
