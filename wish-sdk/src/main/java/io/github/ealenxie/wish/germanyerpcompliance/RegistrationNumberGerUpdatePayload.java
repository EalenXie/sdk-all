package io.github.ealenxie.wish.germanyerpcompliance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/12 16:43
 */
@NoArgsConstructor
@Data
public class RegistrationNumberGerUpdatePayload {


    /**
     * eprNumber
     */
    @JsonProperty("epr_number")
    private String eprNumber;
    /**
     * organizationOrRepresentativeName
     */
    @JsonProperty("organization_or_representative_name")
    private String organizationOrRepresentativeName;
}
