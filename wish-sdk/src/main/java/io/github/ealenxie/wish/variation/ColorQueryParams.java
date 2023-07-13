package io.github.ealenxie.wish.variation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 13:48
 * @version 1.0
 */
@Getter
@Setter
public class ColorQueryParams extends PageQueryParams {
    /**
     * idMax
     */
    @JsonProperty("id_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer idMax;
    /**
     * idMin
     */
    @JsonProperty("id_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String idMin;
}
