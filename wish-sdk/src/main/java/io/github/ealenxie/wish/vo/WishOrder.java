package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/2/23 13:38
 */
@Getter
@Setter
public class WishOrder {
    @JsonProperty("tracking_information")
    private List<TrackingInformation> trackingInformation;
    @JsonProperty("warehouse_information")
    private WarehouseInformation warehouseInformation;
    @JsonProperty("order_payment")
    private OrderPayment orderPayment;
    @JsonProperty("fulfillment_records")
    private List<FulfillmentRecords> fulfillmentRecords;
    @JsonProperty("released_at")
    private String releasedAt;
    @JsonProperty("product_information")
    private ProductInformation productInformation;
    @JsonProperty("penalties")
    private List<String> penalties;
    @JsonProperty("processing_status")
    private String processingStatus;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("full_address")
    private FullAddress fullAddress;
    @JsonProperty("processing_source")
    private String processingSource;
    @JsonProperty("fulfillment_requirements")
    private FulfillmentRequirements fulfillmentRequirements;
    @JsonProperty("state")
    private String state;
    @JsonProperty("transaction_id")
    private String transactionId;
    @JsonProperty("tax_information")
    private TaxInformation taxInformation;
    @JsonProperty("refunds")
    private List<Refunds> refunds;
    @JsonProperty("id")
    private String id;
    /**
     * WISH_EXPRESS: Wish Express
     * FULFILLED_BY_WISH: Fulfilled by Wish
     * FULFILLED_BY_STORE: Fulfilled by Store
     * LESS_THAN_TRUCKLOAD: Less-than-Truckload
     * PREMIUM_SHIPPING_CARRIER_UPGRADE: Premium Shipping Carrier Upgrade
     * ADVANCED_LOGISTICS: Advanced Logistics
     * OPTIONAL_ADVANCED_LOGISTICS: Optional Advanced Logistics
     * CONFIRMED_DELIVERY_POLICY: Confirmed Delivery Policy
     * VAT: Value-added Tax
     * PC_VAT: Pay Customer VAT
     * UNIFICATION_INITIATIVE: Unification Initiative
     * MAX_DELIVERY_DAY_REQUIREMENT: Merchant-set Time To Door
     * CALCULATED_SHIPPING: Calculated Shipping
     * If an order is a part of multiple programs (ex: FULFILLED_BY_WISH & Wish Express), the output will be a combination of the relevant enums (ex: WISH_EXPRESS,FULFILLED_BY_WISH)
     */
    @JsonProperty("fulfillment_order_types")
    private List<String> fulfillmentOrderTypes;
}
