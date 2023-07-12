package io.github.ealenxie.wish.euproductcompliance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/12 14:06
 */
@NoArgsConstructor
@Data
public class ComplianceStatusUpdatePayload {

    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * responsiblePersonId
     */
    @JsonProperty("responsible_person_id")
    private String responsiblePersonId;
}
