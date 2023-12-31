package io.github.ealenxie.allegro;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageQueryParams {
    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer limit;
    @JsonProperty("offset")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer offset;

}
