package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 14:43
 */
@Getter
@Setter
public class PrintSkuResponse {


    /**
     * 返回图片Base64
     */
    @JsonProperty("label_image")
    private String labelImage;
    /**
     * 图片格式
     */
    @JsonProperty("image_type")
    private Integer imageType;
}
