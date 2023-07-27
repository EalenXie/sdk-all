package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/27 9:16
 * @version 1.0
 */
@Getter
@Setter
public class ApiIntegrationPreference {
    /**
     * classicApiIntegration
     */
    @JsonProperty("classic_api_integration")
    private ClassicApiIntegration classicApiIntegration;
    /**
     * restApiIntegration
     */
    @JsonProperty("rest_api_integration")
    private RestApiIntegration restApiIntegration;
}
