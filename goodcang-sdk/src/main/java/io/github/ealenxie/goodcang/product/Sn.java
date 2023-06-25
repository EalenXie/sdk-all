package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 16:23
 */
@Getter
@Setter
public class Sn {
    /**
     * SKU
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 序列号集成码
     */
    @JsonProperty("data_code")
    private String dataCode;
    /**
     * 序列号
     */
    @JsonProperty("serial_number_list")
    private List<String> serialNumberList;
}
