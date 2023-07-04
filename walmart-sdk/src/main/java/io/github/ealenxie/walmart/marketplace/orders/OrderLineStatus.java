package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/24 10:33
 */
@Getter
@Setter
public class OrderLineStatus {
    /**
     * status
     */
    private String status;
    /**
     * statusQuantity
     */
    private StatusQuantity statusQuantity;
    /**
     * trackingInfo
     */
    private TrackingInfo trackingInfo;
    /**
     * returnCenterAddress
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ReturnCenterAddress returnCenterAddress;
}
