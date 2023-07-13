package io.github.ealenxie.wish.taxonomy;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 14:34
 * @version 1.0
 */
@Getter
@Setter
public class CategoryPayload {

    /**
     * isLeaf
     */
    @JsonProperty("is_leaf")
    private Boolean isLeaf;
    /**
     * subcategories
     */
    @JsonProperty("subcategories")
    private List<Object> subcategories;
    /**
     * id
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
}
