package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class LogisticsLabelConfig {
    /**
     * 是否打印时间
     */
    @JsonProperty("is_print_time")
    private String isPrintTime;

    /**
     * 是否打印买方Id
     */
    @JsonProperty("is_print_buyer_id")
    private String isPrintBuyerId;

    /**
     * 是否打印选择信息
     */
    @JsonProperty("is_print_pick_info")
    private String isPrintPickInfo;
}
