package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/30 15:15
 */
@Getter
@Setter
public class PendingChanges {
    /**
     * basePackage
     */
    @JsonProperty("basePackage")
    private PromotionValidPackage basePackage;
}
