package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/3/31 14:20
 * @version 1.0
 */
@Getter
@Setter
public class ProductBarcode {
    /**
     * 数量
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * 产品条码
     */
    @JsonProperty("productBarcode")
    private String productBarcode;
}
