package io.github.ealenxie.paypal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/18 10:02
 */
@Getter
@Setter
public class PageQueryParams {
    @JsonProperty("page_size")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageSize;

    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer page;

    @JsonProperty("total_required")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean totalRequired;
}
