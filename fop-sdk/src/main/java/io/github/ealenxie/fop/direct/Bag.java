package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 11:39
 */
@Getter
@Setter
public class Bag {
    /**
     * 袋子号
     */
    @JsonProperty("bagCode")
    private String bagCode;

    /**
     * 袋子里单票数量
     */
    @JsonProperty("pieces")
    private String pieces;

    /**
     * 袋子重量（单位:g）
     */
    @JsonProperty("bagWeight")
    private String bagWeight;

    /**
     * 装袋分区代码
     */
    @JsonProperty("destinationCountry")
    private String destinationCountry;

    /**
     * 装袋分区代码
     */
    @JsonProperty("partition")
    private String partition;

    /**
     * 订单列表
     */
    @JsonProperty("orderList")
    private List<OrderWeightPayload> orderList;
}
