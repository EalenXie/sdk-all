package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 16:34
 */
@Getter
@Setter
public class CategoriesResponse {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * response
     */
    @JsonProperty("response")
    private CategoryResponse response;
}
