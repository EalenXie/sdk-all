package io.github.ealenxie.winit.oswh.inbound.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/7 14:20
 * @version 1.0
 */
@Getter
@Setter
public class ConfirmShipmentDTO {

    @JsonProperty("orderList")
    private List<InboundOrder> inboundOrder;
}
