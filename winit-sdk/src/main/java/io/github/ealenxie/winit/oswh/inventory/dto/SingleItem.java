package io.github.ealenxie.winit.oswh.inventory.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/3/27 11:22
 * @version 1.0
 */
@Getter
@Setter
public class SingleItem {
    /**
     * 商品编码
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 打印数量，<1000（若为数组，则总数<1000）
     */
    @JsonProperty("printQty")
    private String printQty;
}
