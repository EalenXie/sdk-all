package io.github.ealenxie.fop.pds.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:47
 */
@Getter
@Setter
public class DeliverToRecipientInfo {
    /**
     * 投递类型
     * <p>
     * HOME_DELIVERY-投递到门
     * <p>
     * SELF_PICKUP_STATION-投递门店（自提点）
     * <p>
     * SELF_SERVICE_STATION-投递自提柜(自助点）
     */
    @JsonProperty("deliverType")
    private String deliverType;

    /**
     * 自提门店/自提柜的信息(选择自提时必传，点击获取详情)
     */
    @JsonProperty("stationCode")
    private String stationCode;

    /**
     * 自提点名称
     */
    @JsonProperty("stationName")
    private String stationName;
}
