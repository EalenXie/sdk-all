package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 11:23
 */
@NoArgsConstructor
@Data
public class FilterCriteria {
    /**
     * searchText
     */
    @JsonProperty("searchText")
    private String searchText;
    /**
     * multiValueFilter
     */
    @JsonProperty("multiValueFilter")
    private List<MultiValueFilter> multiValueFilter;
    /**
     * enumFilter
     */
    @JsonProperty("enumFilter")
    private List<EnumFilter> enumFilter;
    /**
     * rangeFilter
     */
    @JsonProperty("rangeFilter")
    private List<RangeFilter> rangeFilter;
}
