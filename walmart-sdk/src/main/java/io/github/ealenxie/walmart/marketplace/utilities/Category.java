package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 16:35
 */
@Getter
@Setter
public class Category {
    /**
     * categoryName
     */
    @JsonProperty("categoryName")
    private String categoryName;
    /**
     * categoryId
     */
    @JsonProperty("categoryId")
    private String categoryId;
}
