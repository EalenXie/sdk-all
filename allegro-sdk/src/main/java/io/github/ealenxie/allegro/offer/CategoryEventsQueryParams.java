package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 15:42
 */
@Getter
@Setter
public class CategoryEventsQueryParams {

    @JsonProperty("from")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String from;

    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer limit;

    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> type;

}
