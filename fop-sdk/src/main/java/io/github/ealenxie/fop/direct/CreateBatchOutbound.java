package io.github.ealenxie.fop.direct;

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
    /**
     * 随机值，无业务语义(必须保证每次请求都不一致，包括系统触发的重试请求，否则请求被拦截)
     */
    @JsonProperty("requestId")
    private String requestId;

    /**
     * 航空主单号
     */
    @JsonProperty("airOrderNo")
    private String airOrderNo;

    /**
     * 航班号
     */
    @JsonProperty("flightNo")
    private String flightNo;

    /**
     * 起飞港
     */
    @JsonProperty("departureAirport")
    private String departureAirport;

    /**
     * 目的港
     */
    @JsonProperty("destinationAirport")
    private String destinationAirport;

    /**
     * 起飞时间
     */
    @JsonProperty("departureTime")
    private String departureTime;

    /**
     * 到达时间
     */
    @JsonProperty("destinatedTime")
    private String destinatedTime;

    /**
     * 装袋信息
     */
    @JsonProperty("bagList")
    private List<Bag> bagList;
}
