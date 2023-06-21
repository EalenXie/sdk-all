package io.github.ealenxie.edayun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SkuInfoDTO {
    /**
     * 产品ID
     */
    @JsonProperty("skuId")
    private Integer skuId;
    /**
     * 需要锁定的数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
}
