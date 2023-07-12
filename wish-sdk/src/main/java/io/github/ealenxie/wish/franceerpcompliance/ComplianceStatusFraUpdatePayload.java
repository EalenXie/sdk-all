package io.github.ealenxie.wish.franceerpcompliance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/12 15:24
 */
@NoArgsConstructor
@Data
public class ComplianceStatusFraUpdatePayload {


    /**
     * uniqueIdentificationNumberId
     */
    @JsonProperty("unique_identification_number_id")
    private String uniqueIdentificationNumberId;
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
}
