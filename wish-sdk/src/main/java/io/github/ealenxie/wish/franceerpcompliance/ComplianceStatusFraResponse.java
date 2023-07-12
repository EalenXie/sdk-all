package io.github.ealenxie.wish.franceerpcompliance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/12 15:26
 */
@NoArgsConstructor
@Data
public class ComplianceStatusFraResponse {
    /**
     * uniqueIdentificationNumberIds
     */
    @JsonProperty("unique_identification_number_ids")
    private List<String> uniqueIdentificationNumberIds;
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
}
