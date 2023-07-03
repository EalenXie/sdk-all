package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class SearchMeta {
    /**
     * availableCount
     */
    @JsonProperty("availableCount")
    private Integer availableCount;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * fallback
     */
    @JsonProperty("fallback")
    private Boolean fallback;
}
