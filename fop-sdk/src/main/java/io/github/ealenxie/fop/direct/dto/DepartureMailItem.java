package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 12:29
 */
@Setter
@Getter
public class DepartureMailItem {

    @JsonProperty("requestId")
    private String requestId;

    @JsonProperty("airOrderNo")
    private String airOrderNo;
    @JsonProperty("departureAirport")
    private String departureAirport;

    @JsonProperty("flightNo")
    private String flightNo;
    @JsonProperty("departureTime")
    private Long departureTime;
    @JsonProperty("destinatedTime")
    private Long destinatedTime;
    @JsonProperty("orderList")
    private List<OrderVO> orderList;

}
