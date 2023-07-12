package io.github.ealenxie.wish.euproductcompliance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 14:06
 */
@Getter
@Setter
public class ComplianceStatusEuUpdatePayload {

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
