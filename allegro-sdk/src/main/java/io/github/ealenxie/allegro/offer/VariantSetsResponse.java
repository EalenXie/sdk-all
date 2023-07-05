package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdNamePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 11:03
 */
@Getter
@Setter
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
