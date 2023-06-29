package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 16:26
 */
@Getter
@Setter
public class OfferEventsQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("from")
    private String from;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("limit")
    private Integer limit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("type")
    private List<String> type;
}
