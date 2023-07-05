package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.UrlPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@Getter
@Setter
public class Products {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * description
     */
    @JsonProperty("description")
    private Description description;
    /**
     * category
     */
    @JsonProperty("category")
    private ProductsCategory category;
    /**
     * images
     */
    @JsonProperty("images")
    private List<UrlPayload> images;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<ProductsParameters> parameters;
    /**
     * isDraft
     */
    @JsonProperty("isDraft")
    private Boolean isDraft;
}
