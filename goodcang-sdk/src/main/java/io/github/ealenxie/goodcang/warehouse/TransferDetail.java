package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 10:23
 */
@Getter
@Setter
public class TransferDetail {
    /**
     * 箱号
     */
    @JsonProperty("box_no")
    private Integer boxNo;
    /**
     * SKU
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 中转预报数量
     */
    @JsonProperty("transit_pre_count")
    private Integer transitPreCount;
    /**
     * 中转收货数量
     */
    @JsonProperty("transit_receiving_count")
    private Integer transitReceivingCount;
}
