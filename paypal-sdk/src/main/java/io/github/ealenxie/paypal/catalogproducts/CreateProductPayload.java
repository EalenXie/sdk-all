package io.github.ealenxie.paypal.catalogproducts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/19 13:52
 */
@Getter
@Setter
public class CreateProductPayload {

    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * category
     */
    @JsonProperty("category")
    private String category;
    /**
     * imageUrl
     */
    @JsonProperty("image_url")
    private String imageUrl;
    /**
     * homeUrl
     */
    @JsonProperty("home_url")
    private String homeUrl;
}
