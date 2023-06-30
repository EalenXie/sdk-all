package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 15:44
 */
@NoArgsConstructor
@Data
public class PromoOptionsResponse {

    /**
     * promoOptions
     */
    @JsonProperty("promoOptions")
    private List<PromoOptionResponse> promoOptions;
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
}
