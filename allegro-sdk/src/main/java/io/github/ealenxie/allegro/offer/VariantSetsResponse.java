package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 11:03
 */
@NoArgsConstructor
@Data
public class VariantSetsResponse {


    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * offerVariants
     */
    @JsonProperty("offerVariants")
    private List<IdNamePayload> offerVariants;
}
