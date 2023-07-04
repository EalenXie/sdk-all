package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 17:17
 * @version 1.0
 */
@Getter
@Setter
public class DateQueryParams {
    /**
     * dateGte
     */
    @JsonProperty("date.gte")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dateGte;
    /**
     * dateLte
     */
    @JsonProperty("date.lte")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dateLte;
}
