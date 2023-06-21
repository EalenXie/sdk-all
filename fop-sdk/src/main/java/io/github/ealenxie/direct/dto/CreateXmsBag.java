package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 12:39
 */
@Getter
@Setter
public class CreateXmsBag {

    @JsonProperty("request_id")
    private String requestId;
    @JsonProperty("bag_weight")
    private Integer bagWeight;
    @JsonProperty("finish_bagging_time")
    private Long finishBaggingTime;
    @JsonProperty("pieces")
    private Integer pieces;
    @JsonProperty("order_list")
    private List<OrderVO> orderList;
}
