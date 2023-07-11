package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 10:14
 */
@NoArgsConstructor
@Data
public class SubRegions {
    /**
     * subRegionCode
     */
    @JsonProperty("subRegionCode")
    private String subRegionCode;
}
