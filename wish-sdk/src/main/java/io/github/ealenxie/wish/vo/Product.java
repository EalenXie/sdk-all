package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class Product {
    @JsonProperty("name")
    private String name;
    @JsonProperty("weight")
    private Weight weight;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("hs_code")
    private String hsCode;
    @JsonProperty("condition")
    private String condition;
    @JsonProperty("quantity")
    private Integer quantity;
}
