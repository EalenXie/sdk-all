package io.github.ealenxie.wish.penalties;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 14:13
 */
@Getter
@Setter
public class PenaltiesCountQueryParams {

    @JsonProperty("created_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAtMax;
    @JsonProperty("created_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAtMin;
    @JsonProperty("reversed_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String reversedAtMax;
    @JsonProperty("reversed_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String reversedAtMin;

}
