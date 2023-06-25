package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 13:34
 */
@Getter
@Setter
public class Category {
    /**
     * 品类ID
     */
    @JsonProperty("category_id")
    private Integer categoryId;
    /**
     * 品类父ID
     */
    @JsonProperty("parent_category_id")
    private Integer parentCategoryId;
    /**
     * 品类中文名
     */
    @JsonProperty("category_name")
    private String categoryName;
    /**
     * 品类英文名
     */
    @JsonProperty("category_name_en")
    private String categoryNameEn;
    /**
     * 品类级别
     */
    @JsonProperty("category_level")
    private Integer categoryLevel;
}
