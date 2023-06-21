package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/14 10:34
 */
@Getter
@Setter
public class SnInfoDTO {
    @JsonProperty("is_collect_serial_number")
    private String isCollectSerialNumber;
    @JsonProperty("is_inbound_collect_serial_number")
    private String isInboundCollectSerialNumber;
    @JsonProperty("is_return_collect_serial_number")
    private String isReturnCollectSerialNumber;
}
