package io.github.ealenxie.alyunwms.vo.asn;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/22 16:56
 * @version 1.0
 */
@Getter
@Setter
public class WarehouseAttr {
    /**
     * 长
     */
    @JsonProperty("product_length")
    private String productLength;
    /**
     * 宽
     */
    @JsonProperty("product_width")
    private String productWidth;
    /**
     * 高
     */
    @JsonProperty("product_height")
    private String productHeight;
    /**
     * 重
     */
    @JsonProperty("product_weight")
    private String productWeight;
}
