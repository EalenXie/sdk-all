package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 19:47
 */
@Getter
@Setter
public class DeliverToRecipientInfo {
    @JsonProperty("channelCode")
    private String channelCode;
    @JsonProperty("deliverType")
    private String deliverType;
    @JsonProperty("deliveryNo")
    private String deliveryNo;
    @JsonProperty("stationCode")
    private String stationCode;
}
