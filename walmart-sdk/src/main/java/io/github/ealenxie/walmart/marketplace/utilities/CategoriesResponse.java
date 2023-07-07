package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 16:34
 */
@NoArgsConstructor
@Data
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
