package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 16:07
 * @version 1.0
 */
@Getter
@Setter
public class ItemThirdPayload {
    /**
     * 第三方商品编码
     */
    @JsonProperty("skuCodeThird")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String skuCodeThird;
    /**
     * 第三方商品编码的说明
     */
    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;
}
