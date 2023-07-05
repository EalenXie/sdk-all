package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/5 11:00
 */
@NoArgsConstructor
@Data
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
