package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 12:50
 */
@Getter
@Setter
public class IrpItemsGetPayload {

    /**
     * filter
     */
    @JsonProperty("filter")
    private Filter filter;
    @JsonProperty("search")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Search> search;

    @JsonProperty("sort")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Sort> sort;
}
