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
     * 起飞港
     */
    @JsonProperty("departureAirport")
    private String departureAirport;

    /**
     * 航班号
     */
    @JsonProperty("flightNo")
    private String flightNo;

    /**
     * 起飞时间
     */
    @JsonProperty("departureTime")
    private Long departureTime;

    /**
     * 到达时间
     */
    @JsonProperty("destinatedTime")
    private Long destinatedTime;

    /**
     * 订单列表
     */
    @JsonProperty("orderList")
    private List<OrderVO> orderList;

}
