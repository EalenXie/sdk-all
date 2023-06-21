package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class LogisticsLabelConfig {
    @JsonProperty("is_print_time")
    private String isPrintTime;
    @JsonProperty("is_print_buyer_id")
    private String isPrintBuyerId;
    @JsonProperty("is_print_pick_info")
    private String isPrintPickInfo;
}
