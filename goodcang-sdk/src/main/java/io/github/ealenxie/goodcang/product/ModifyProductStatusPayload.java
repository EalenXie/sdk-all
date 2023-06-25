package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 16:06
 */
@Getter
@Setter
public class ModifyProductStatusPayload {
    /**
     * 产品SKU
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * 当前状态
     */
    @JsonProperty("current_status")
    private Integer currentStatus;
    /**
     * 修改产品的目标状态
     */
    @JsonProperty("change_status")
    private Integer changeStatus;
}
