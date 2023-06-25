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
public class SnInfo {

    /**
     * 出库是否采集序列号
     */
    @JsonProperty("is_collect_serial_number")
    private Integer isCollectSerialNumber;
    /**
     * 入库是否采集序列号
     */
    @JsonProperty("is_inbound_collect_serial_number")
    private Integer isInboundCollectSerialNumber;
    /**
     * 退件是否采集序列号
     */
    @JsonProperty("is_return_collect_serial_number")
    private Integer isReturnCollectSerialNumber;
}
