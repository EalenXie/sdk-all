package io.github.ealenxie.wish.tickets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 14:17
 * @version 1.0
 */
@Getter
@Setter
public class TicketQueryParams extends PageQueryParams {
    /**
     * limit
     */
    @JsonProperty("states")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> states;
    /**
     * sortBy
     */
    @JsonProperty("types")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> types;
    /**
     * updatedAtMax
     */
    @JsonProperty("updated_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updatedAtMax;
    /**
     * updatedAtMin
     */
    @JsonProperty("updated_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updatedAtMin;
}
