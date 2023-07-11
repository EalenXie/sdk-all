package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 15:10
 */
@Getter
@Setter
public class OrderLine {
    /**
     * fulfillmentType
     */
    @JsonProperty("fulfillmentType")
    private String fulfillmentType;
    /**
     * lastModified
     */
    @JsonProperty("lastModified")
    private String lastModified;
    /**
     * shippingMethod
     */
    @JsonProperty("shippingMethod")
    private String shippingMethod;
    /**
     * shippingTier
     */
    @JsonProperty("shippingTier")
    private String shippingTier;
    /**
     * orderLineQuantityInfo
     */
    @JsonProperty("orderLineQuantityInfo")
    private List<OrderLineQuantityInfo> orderLineQuantityInfo;
    /**
     * orderProduct
     */
    @JsonProperty("orderProduct")
    private OrderProduct orderProduct;
    /**
     * orderedQty
     */
    @JsonProperty("orderedQty")
    private Qty orderedQty;
    /**
     * shipToAddress
     */
    @JsonProperty("shipToAddress")
    private OrderLineShipToAddress shipToAddress;
}
