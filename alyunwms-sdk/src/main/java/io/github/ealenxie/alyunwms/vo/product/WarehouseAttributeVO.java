package io.github.ealenxie.alyunwms.vo.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author lanzhi
 * Created on 2023/2/11 16:52
 **/
@Getter
@Setter
public class WarehouseAttributeVO {
    /**
     * 仓库编码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 长
     */
    @JsonProperty("product_length")
    private BigDecimal productLength;
    /**
     * 宽度
     */
    @JsonProperty("product_width")
    private BigDecimal productWidth;
    /**
     * 高
     */
    @JsonProperty("product_height")
    private BigDecimal productHeight;
    /**
     * 重量
     */
    @JsonProperty("product_weight")
    private BigDecimal productWeight;
}

