package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 19:47
 * <p>
 * 投递信息
 */
@Getter
@Setter
public class DeliverToRecipientInfo {
    /**
     * 通道编码
     */
    @JsonProperty("channelCode")
    private String channelCode;

    /**
     * 投递类型：
     * <p>
     * HOME_DELIVERY-投递到门；
     * SELF_PICKUP_STATION-投递门店；
     * SELF_SERVICE_STATION-投递自提柜(自助点）
     * <p>
     * 默认：HOME_DELIVERY
     */
    @JsonProperty("deliverType")
    private String deliverType;

    /**
     * 投递单号
     */
    @JsonProperty("deliveryNo")
    private String deliveryNo;

    /**
     * 自提门店/自提点的信息
     * <p>
     * 选择自提时必传
     */
    @JsonProperty("stationCode")
    private String stationCode;
}
