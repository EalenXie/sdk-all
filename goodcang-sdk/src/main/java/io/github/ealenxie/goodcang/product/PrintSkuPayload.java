package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 14:42
 */
@Getter
@Setter
public class PrintSkuPayload {

    /**
     * 打印尺寸
     */
    @JsonProperty("print_size")
    private Integer printSize;
    /**
     * 打印编码
     */
    @JsonProperty("print_code")
    private Integer printCode;
    /**
     * 产品编码
     */
    @JsonProperty("product_sku_arr")
    private List<String> productSkuArr;
}
