package io.github.ealenxie.wish.germanyerpcompliance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 16:35
 */
@Getter
@Setter
public class ComplianceStatusGerUpdatePayload {

    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * eprRegistrationNumberId
     */
    @JsonProperty("epr_registration_number_id")
    private String eprRegistrationNumberId;
}
