package io.github.ealenxie.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:15
 */
@Getter
@Setter
public class DeclareSku {
    @JsonProperty("sku_code")
    private String skuCode;
    @JsonProperty("declare_sku_status")
    private String declareSkuStatus;
}
