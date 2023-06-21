package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/23 11:08
 * @version 1.0
 */
@Getter
@Setter
public class Product {
    /**
     * 数量
     */
    @JsonProperty("opQuantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer opQuantity;
    /**
     * 产品代码
     */
    @JsonProperty("productBarcode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productBarcode;
}
