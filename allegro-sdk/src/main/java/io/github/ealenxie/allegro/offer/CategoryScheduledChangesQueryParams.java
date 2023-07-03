package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 15:20
 */
@Setter
@Getter
public class CategoryScheduledChangesQueryParams extends PageQueryParams {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("scheduledFor.gte")
    private String scheduledForGte;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("scheduledFor.lte")
    private String scheduledForLte;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("scheduledAt.gte")
    private String scheduledAtGte;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("scheduledAt.lte")
    private String scheduledAtLte;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("type")
    private String type;

}
