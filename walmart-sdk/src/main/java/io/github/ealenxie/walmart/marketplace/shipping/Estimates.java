package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 10:50
 */
@Getter
@Setter
public class Estimates {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * displayName
     */
    @JsonProperty("displayName")
    private String displayName;
    /**
     * deliveryDate
     */
    @JsonProperty("deliveryDate")
    private String deliveryDate;
    /**
     * estimatedRate
     */
    @JsonProperty("estimatedRate")
    private Money estimatedRate;
    /**
     * serviceTypeGroupName
     */
    @JsonProperty("serviceTypeGroupName")
    private String serviceTypeGroupName;
    /**
     * serviceTypeGroupDisplayName
     */
    @JsonProperty("serviceTypeGroupDisplayName")
    private String serviceTypeGroupDisplayName;
    /**
     * isDeliveryPromiseFulfilled
     */
    @JsonProperty("isDeliveryPromiseFulfilled")
    private Boolean isDeliveryPromiseFulfilled;
    /**
     * carrierName
     */
    @JsonProperty("carrierName")
    private String carrierName;
    /**
     * carrierDisplayName
     */
    @JsonProperty("carrierDisplayName")
    private String carrierDisplayName;
}
