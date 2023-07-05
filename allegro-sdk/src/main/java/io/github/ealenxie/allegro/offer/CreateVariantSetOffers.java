package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/5 11:00
 */
@Getter
@Setter
public class CreateVariantSetOffers {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * colorPattern
     */
    @JsonProperty("colorPattern")
    private String colorPattern;
}
