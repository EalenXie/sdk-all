package io.github.ealenxie.wish.price;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.UnitValuePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 9:49
 * @version 1.0
 */
@Getter
@Setter
public class CreateShipmentPayload {

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
     * additionalTrackingServices
     */
    @JsonProperty("additional_tracking_services")
    private List<String> additionalTrackingServices;
    /**
     * senderName
     */
    @JsonProperty("sender_name")
    private String senderName;
    /**
     * packageWeight
     */
    @JsonProperty("package_weight")
    private UnitValuePayload packageWeight;
    /**
     * packageDimensions
     */
    @JsonProperty("package_dimensions")
    private PackageDimensions packageDimensions;
}
