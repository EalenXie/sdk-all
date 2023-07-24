package io.github.ealenxie.paypal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 10:48
 */
@Getter
@Setter
public class PageParams {
    @JsonProperty("fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fields;
    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer page;
    @JsonProperty("page_size")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageSize;


}
