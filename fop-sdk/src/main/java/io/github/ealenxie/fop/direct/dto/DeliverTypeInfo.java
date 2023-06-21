package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class DeliverTypeInfo {
    @JsonProperty("deliver_type")
    private String deliverType;
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("pick_up_info")
    private PickUpInfo pickUpInfo;
    @JsonProperty("express_to_4px_info")
    private ExpressTo4pxInfo expressTo4pxInfo;
    @JsonProperty("self_send_to_4px_info")
    private SelfSendTo4pxInfo selfSendTo4pxInfo;
}
