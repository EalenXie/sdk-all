package io.github.ealenxie.fop.track.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/27 16:03
 */
@Getter
@Setter
public class DeliveryOrder {

    /**
     * 返回传入的物流单号
     */
    @JsonProperty("deliveryOrderNo")
    private String deliveryOrderNo;

    /**
     * 目的地国家
     */
    @JsonProperty("destinationCountry")
    private String destinationCountry;

    /**
     * 物流轨迹信息集合
     */
    @JsonProperty("trackingList")
    private List<Tracking> trackingList;
}
