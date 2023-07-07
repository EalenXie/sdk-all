package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 10:47
 */
@NoArgsConstructor
@Data
public class ShippingEstimatePayload {


    /**
     * packageType
     */
    @JsonProperty("packageType")
    private String packageType;
    /**
     * boxDimensions
     */
    @JsonProperty("boxDimensions")
    private BoxDimensions boxDimensions;
    /**
     * shipByDate
     */
    @JsonProperty("shipByDate")
    private String shipByDate;
    /**
     * deliverByDate
     */
    @JsonProperty("deliverByDate")
    private String deliverByDate;
    /**
     * carriers
     */
    @JsonProperty("carriers")
    private List<String> carriers;
    /**
     * fromAddress
     */
    @JsonProperty("fromAddress")
    private ShippingEstimateFromAddress fromAddress;
    /**
     * toAddress
     */
    @JsonProperty("toAddress")
    private ToAddress toAddress;
    /**
     * includeServicesNotMeetingDeliveryPromise
     */
    @JsonProperty("includeServicesNotMeetingDeliveryPromise")
    private Boolean includeServicesNotMeetingDeliveryPromise;
}
