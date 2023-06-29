package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class UserRatingsQueryParams {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("recommended")
    private String recommended;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("lastChangedAt.gte")
    private String lastChangedAtGte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("lastChangedAt.lte")
    private String lastChangedAtLte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("limit")
    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("offset")
    private String offset;


}
