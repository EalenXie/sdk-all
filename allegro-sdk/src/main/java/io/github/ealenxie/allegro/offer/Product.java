package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 10:05
 */
@NoArgsConstructor
@Data
public class Product {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * category
     */
    @JsonProperty("category")
    private IdNamePayload category;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * idType
     */
    @JsonProperty("idType")
    private String idType;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<ParametersPayload> parameters;
    /**
     * images
     */
    @JsonProperty("images")
    private List<String> images;
}
