package io.github.ealenxie.allegro.vo.checkoutform;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.enums.ShipmentSummarySentStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class ShipmentSummary {
    /**
     * 装运摘要：枚举 "NONE" "SOME" "ALL"
     * {@link ShipmentSummarySentStatus}
     */
    @JsonProperty("lineItemsSent")
    private String lineItemsSent;
}
