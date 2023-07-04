package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 16:37
 * @version 1.0
 */
@Getter
@Setter
public class RegisterProduct {
    /**
     * 商品sku
     */
    @JsonProperty("productCode")
    private String productCode;
}
