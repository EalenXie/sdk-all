package io.github.ealenxie.wish.price;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import io.github.ealenxie.wish.UnitValuePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 10:03
 * @version 1.0
 */
@Getter
@Setter
public class ShipmentPayload {

    /**
     * finalPackageWeight
     */
    @JsonProperty("final_package_weight")
    private UnitValuePayload finalPackageWeight;
    /**
     * finalPackageDimensions
     */
    @JsonProperty("final_package_dimensions")
    private PackageDimensions finalPackageDimensions;
    /**
     * initialPackageDimensions
     */
    @JsonProperty("initial_package_dimensions")
    private PackageDimensions initialPackageDimensions;
    /**
     * initialPackageWeight
     */
    @JsonProperty("initial_package_weight")
    private UnitValuePayload initialPackageWeight;
    /**
     * orderId
     */
    @JsonProperty("order_id")
    private String orderId;
    /**
     * originAddress
     */
    @JsonProperty("origin_address")
    private OriginAddress originAddress;
    /**
     * createdAt
     */
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * packageType
     */
    @JsonProperty("package_type")
    private String packageType;
    /**
     * shippingOptionId
     */
    @JsonProperty("shipping_option_id")
    private String shippingOptionId;
    /**
     * shipmentState
     */
    @JsonProperty("shipment_state")
    private String shipmentState;
    /**
     * recipientName
     */
    @JsonProperty("recipient_name")
    private String recipientName;
    /**
     * trackingNumber
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;
    /**
     * carrier
     */
    @JsonProperty("carrier")
    private String carrier;
    /**
     * labelUrl
     */
    @JsonProperty("label_url")
    private String labelUrl;
    /**
     * destinationAddress
     */
    @JsonProperty("destination_address")
    private OriginAddress destinationAddress;
    /**
     * initialPrice
     */
    @JsonProperty("initial_price")
    private Money initialPrice;
    /**
     * shipmentId
     */
    @JsonProperty("shipment_id")
    private String shipmentId;
    /**
     * finalPrice
     */
    @JsonProperty("final_price")
    private Money finalPrice;
}
