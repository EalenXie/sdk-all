package io.github.ealenxie.track.vo;

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


    @JsonProperty("deliveryOrderNo")
    private String deliveryOrderNo;
    @JsonProperty("destinationCountry")
    private String destinationCountry;
    @JsonProperty("trackingList")
    private List<Tracking> trackingList;
}
