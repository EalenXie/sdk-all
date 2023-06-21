package io.github.ealenxie.manomano.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/8/16 9:45
 */
@Getter
@Setter
public class Products {
    @JsonProperty("product")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Product> product;
}
