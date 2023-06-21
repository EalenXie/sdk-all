package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月23日 0023 15 21
 */
@Getter
@Setter
public class TakeStockForLocationProductDTO {
    /**
     * 产品sku
     */
    @JsonProperty("productSku")
    private String productSku;

    /**
     * 库位
     */
    @JsonProperty("lcCode")
    private String lcCode;

    /**
     * 调整数量：库存变化量，如：初始数量9，最终库存为8，则调整数量为1
     */
    @JsonProperty("quantity")
    private Integer quantity;

    /**
     * 盘点类型：1:盘亏，2：盘盈
     */
    @JsonProperty("takeStockType")
    private Integer takeStockType;
}
