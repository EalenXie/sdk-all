package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 11:34
 */
@Getter
@Setter
public class OfferTagsResponse {

    /**
     * tags
     */
    @JsonProperty("tags")
    private List<OfferTag> tags;
}
