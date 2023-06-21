package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class DeliverTypeInfo {
    @JsonProperty("deliverType")
    private String deliverType;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("pickUpInfo")
    private PickUpInfo pickUpInfo;
    @JsonProperty("expressToFpxInfo")
    private ExpressToFpxInfo expressToFpxInfo;
    @JsonProperty("selfSendToFpxInfo")
    private SelfSendToFpxInfo selfSendToFpxInfo;
}
