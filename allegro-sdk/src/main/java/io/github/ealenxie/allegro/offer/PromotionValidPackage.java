package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/30 15:15
 */
@Getter
@Setter
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
