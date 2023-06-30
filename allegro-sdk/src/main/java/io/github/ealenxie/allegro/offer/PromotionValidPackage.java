package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/30 15:15
 */
@NoArgsConstructor
@Data
public class PromotionValidPackage {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * validFrom
     */
    @JsonProperty("validFrom")
    private String validFrom;
    /**
     * validTo
     */
    @JsonProperty("validTo")
    private String validTo;
    /**
     * nextCycleDate
     */
    @JsonProperty("nextCycleDate")
    private String nextCycleDate;
}
