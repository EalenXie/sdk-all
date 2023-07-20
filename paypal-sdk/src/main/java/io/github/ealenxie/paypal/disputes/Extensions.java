package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@Getter
@Setter
public class Extensions {
    /**
     * merchandizeDisputeProperties
     */
    @JsonProperty("merchandize_dispute_properties")
    private MerchandizeDisputeProperties merchandizeDisputeProperties;
}
