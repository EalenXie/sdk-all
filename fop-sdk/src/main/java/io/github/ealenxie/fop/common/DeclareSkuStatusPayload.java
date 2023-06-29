package io.github.ealenxie.fop.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:15
 */
@Getter
@Setter
public class DeclareSkuStatusPayload {
    /**
     * SKU编码
     */
    @JsonProperty("sku_code")
    private String skuCode;

    /**
     * SKU申报审核状态。
     * <p>
     * 如：N（草稿）；S（待审核）；C（已审核）；E（异常）
     */
    @JsonProperty("declare_sku_status")
    private String declareSkuStatus;
}
