package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 16:52
 * @version 1.0
 */
@Getter
@Setter
public class Subcategory {
    /**
     * subCategoryName
     */
    @JsonProperty("subCategoryName")
    private String subCategoryName;
    /**
     * subCategoryId
     */
    @JsonProperty("subCategoryId")
    private String subCategoryId;
}
