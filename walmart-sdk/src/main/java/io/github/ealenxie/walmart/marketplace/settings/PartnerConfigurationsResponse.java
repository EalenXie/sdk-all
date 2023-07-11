package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 14:41
 */
@NoArgsConstructor
@Data
public class PartnerConfigurationsResponse {
    /**
     * partner
     */
    @JsonProperty("partner")
    private Partner partner;
    /**
     * configurations
     */
    @JsonProperty("configurations")
    private List<Configurations> configurations;
}
