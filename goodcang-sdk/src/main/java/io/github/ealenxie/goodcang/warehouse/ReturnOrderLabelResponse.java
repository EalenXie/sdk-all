package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 15:50
 */
@Getter
@Setter
public class ReturnOrderLabelResponse {

    /**
     * 编码面单文件
     */
    @JsonProperty("label_base64")
    private String labelBase64;
    /**
     * png或pdf
     */
    @JsonProperty("label_type")
    private String labelType;
}
