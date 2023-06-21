package io.github.ealenxie.fop.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/14 15:03
 */
@Getter
@Setter
public class SkuCreateVO {
    /**
     * sku编码
     */
    @JsonProperty("sku_code")
    private String skuCode;
    /**
     * 数字条码
     */
    @JsonProperty("sku_id")
    private String skuId;
}
