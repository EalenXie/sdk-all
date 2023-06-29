package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 10:22
 */
@Getter
@Setter
public class CarriersTrackingResponse {

    /**
     * carrierId
     */
    @JsonProperty("carrierId")
    private String carrierId;
    /**
     * waybills
     */
    @JsonProperty("waybills")
    private List<CarriersTrackingWaybill> waybills;
}
