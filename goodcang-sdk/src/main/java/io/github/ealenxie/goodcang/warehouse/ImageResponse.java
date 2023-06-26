package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 10:36
 */
@Getter
@Setter
public class ImageResponse {

    /**
     * 返回文件
     */
    @JsonProperty("label_image")
    private String labelImage;
    /**
     * 文件类型 1 png  2 pdf
     */
    @JsonProperty("image_type")
    private Integer imageType;
}
