package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@NoArgsConstructor
@Data
public class MerchandizeDisputeProperties {
    /**
     * issueType
     */
    @JsonProperty("issue_type")
    private String issueType;
    /**
     * serviceDetails
     */
    @JsonProperty("service_details")
    private ServiceDetails serviceDetails;
}
