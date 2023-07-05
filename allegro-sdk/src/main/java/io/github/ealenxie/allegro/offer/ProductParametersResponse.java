package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 9:44
 */
@Getter
@Setter
public class ProductParametersResponse {


    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<ProductParameter> parameters;
}
