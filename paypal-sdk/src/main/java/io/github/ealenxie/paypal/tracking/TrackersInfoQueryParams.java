package io.github.ealenxie.paypal.tracking;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/19 13:27
 */
@Getter
@Setter
public class TrackersInfoQueryParams {

    /**
     * transactionId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("transaction_id")
    private String transactionId;
    /**
     * trackingNumber
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tracking_number")
    private String trackingNumber;
}
