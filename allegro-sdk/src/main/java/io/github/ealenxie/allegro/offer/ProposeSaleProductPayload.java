package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:55
 */
@NoArgsConstructor
@Data
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
    private List<Images> images;
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
