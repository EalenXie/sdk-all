package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdNamePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 10:05
 */
@Getter
@Setter
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
