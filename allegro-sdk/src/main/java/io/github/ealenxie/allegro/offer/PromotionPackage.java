package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/30 11:08
 */
@Getter
@Setter
public class PromotionPackage {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * cycleDuration
     */
    @JsonProperty("cycleDuration")
    private String cycleDuration;
}
