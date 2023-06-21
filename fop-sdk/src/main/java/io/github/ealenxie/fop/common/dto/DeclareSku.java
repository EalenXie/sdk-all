package io.github.ealenxie.fop.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:07
 */
@Getter
@Setter
public class DeclareSku {
    @JsonProperty("sku_code")
    private String skuCode;
}
