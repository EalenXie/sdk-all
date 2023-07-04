package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 10:58
 * @version 1.0
 */
@Getter
@Setter
public class OutboundOrderNumPayload {
    /**
     * 海外仓出库单号
     */
    @JsonProperty("outboundOrderNum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String outboundOrderNum;
}
