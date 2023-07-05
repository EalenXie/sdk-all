package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import io.github.ealenxie.allegro.UrlPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:55
 */
@Getter
@Setter
public class ProposeSaleProductPayload {


    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * category
     */
    @JsonProperty("category")
    private IdPayload category;
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
     * description
     */
    @JsonProperty("description")
    private Description description;
    /**
     * language
     */
    @JsonProperty("language")
    private String language;
}
