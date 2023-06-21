package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/27 16:58
 */
@Getter
@Setter
public class FulfillmentOrder {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("shop_id")
    private Long shopId;
    @JsonProperty("order_id")
    private Long orderId;
    @JsonProperty("assigned_location_id")
    private Long assignedLocationId;
    @JsonProperty("request_status")
    private String requestStatus;
    @JsonProperty("status")
    private String status;
    @JsonProperty("supported_actions")
    private List<String> supportedActions;
    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("line_items")
    private List<FulfillmentOrderLineItem> lineItems;
    @JsonProperty("fulfill_at")
    private String fulfillAt;
    @JsonProperty("fulfill_by")
    private String fulfillBy;
    @JsonProperty("international_duties")
    private String internationalDuties;
    @JsonProperty("fulfillment_holds")
    private List<FulfillmentHold> fulfillmentHolds;
    @JsonProperty("delivery_method")
    private DeliveryMethod deliveryMethod;
    @JsonProperty("assigned_location")
    private AssignedLocation assignedLocation;
    @JsonProperty("merchant_requests")
    private List<MerchantRequest> merchantRequests;
}
