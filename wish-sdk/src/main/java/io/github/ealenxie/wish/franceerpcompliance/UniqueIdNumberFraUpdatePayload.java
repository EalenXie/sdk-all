package io.github.ealenxie.wish.franceerpcompliance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/12 16:15
 */
@NoArgsConstructor
@Data
public class UniqueIdNumberFraUpdatePayload {
    /**
     * uin
     */
    @JsonProperty("uin")
    private String uin;
    /**
     * productResponsibilityOrganization
     */
    @JsonProperty("product_responsibility_organization")
    private String productResponsibilityOrganization;
}
