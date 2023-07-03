package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class NotRecommended {
    /**
     * total
     */
    @JsonProperty("total")
    private Integer total;
    /**
     * unique
     */
    @JsonProperty("unique")
    private Integer unique;
}
