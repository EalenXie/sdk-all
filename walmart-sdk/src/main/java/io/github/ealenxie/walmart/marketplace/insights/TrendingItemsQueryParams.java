package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:43
 */
@Setter
@Getter
public class TrendingItemsQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String departmentId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String categoryId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offset;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String timeFrame;
}
