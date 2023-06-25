package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/14 10:34
 */
@Getter
@Setter
public class BatchInfo {
    /**
     * 有效期批次信息
     */
    @JsonProperty("validity_period_info")
    private ValidityPeriodInfo validityPeriodInfo;
}
