package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 11:38
 */
@Getter
@Setter
public class CreateBatchOutbound {

    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("airOrderNo")
    private String airOrderNo;
    @JsonProperty("flightNo")
    private String flightNo;
    @JsonProperty("departureAirport")
    private String departureAirport;
    @JsonProperty("destinationAirport")
    private String destinationAirport;
    @JsonProperty("departureTime")
    private String departureTime;
    @JsonProperty("destinatedTime")
    private String destinatedTime;
    @JsonProperty("bagList")
    private List<Bag> bagList;
}
