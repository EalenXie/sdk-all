package io.github.ealenxie.wish.fbs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 15:13
 */
@Getter
@Setter
public class FbsRecommendationsQueryParams {

    @JsonProperty("id_max")
    private String idMax;
    @JsonProperty("id_min")
    private String idMin;
}
