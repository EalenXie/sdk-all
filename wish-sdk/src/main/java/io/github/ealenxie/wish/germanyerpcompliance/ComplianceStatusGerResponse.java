package io.github.ealenxie.wish.germanyerpcompliance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/12 15:26
 */
@NoArgsConstructor
@Data
public class ComplianceStatusGerResponse {

    /**
     * complianceStatus
     */
    @JsonProperty("compliance_status")
    private String complianceStatus;
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * eprRegistrationNumberIds
     */
    @JsonProperty("epr_registration_number_ids")
    private List<String> eprRegistrationNumberIds;
}
