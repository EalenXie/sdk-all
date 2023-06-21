package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SkuInfo {
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
    /**
     * 状态:success成功,fail失败
     */
    @JsonProperty("status")
    private String status;
    /**
     * 原因,当status等于fail时才会有值
     */
    @JsonProperty("reason")
    private String reason;
}
