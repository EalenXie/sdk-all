package io.github.ealenxie.wish.franceerpcompliance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 15:44
 */
@Getter
@Setter
public class UniqueIdNumberFraCreatePayload {


    /**
     * category
     */
    @JsonProperty("category")
    private String category;
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
