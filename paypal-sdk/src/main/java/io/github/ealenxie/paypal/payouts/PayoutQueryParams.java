package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/27 10:44
 **/
@Getter
@Setter
public class PayoutQueryParams {
    /**
     * Shows details for only the specified fields.
     */
    @JsonProperty("fields")
    private String fields;
    /**
     * A non-zero integer representing the page of the results.
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * The maximum number of results to return at one time.
     * Value is a non-negative, non-zero integer.
     * If the user chooses pagination, the maximum page is 1000.
     */
    @JsonProperty("page_size")
    private Integer pageSize;
    /**
     * Indicates whether to show the total items and total pages count in the response.
     */
    @JsonProperty("total_required")
    private Boolean totalRequired;
}

