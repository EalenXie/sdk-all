package io.github.ealenxie.paypal.tracking;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/19 11:26
 */
@Getter
@Setter
public class TrackerIdentifier {
    /**
     * transactionId
     */
    @JsonProperty("transaction_id")
    private String transactionId;
    /**
     * trackingNumber
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
