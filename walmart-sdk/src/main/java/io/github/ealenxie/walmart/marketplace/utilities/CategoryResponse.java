package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 16:35
 */
@Getter
@Setter
public class CategoryResponse {
    /**
     * departmentName
     */
    @JsonProperty("departmentName")
    private String departmentName;
    /**
     * departmentId
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * category
     */
    @JsonProperty("category")
    private List<Category> category;
}
