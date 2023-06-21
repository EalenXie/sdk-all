package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 9:25
 */

@Setter
@Getter
public class CreateCrossOrderResp {
    /**
     * 订单总金额（单位分），一次创建多个订单时，该字段为空
     */
    @JsonProperty("totalSuccessAmount")
    private Long totalSuccessAmount;
    /**
     * 订单ID，一次创建多个订单时，该字段为空
     */
    @JsonProperty("orderId")
    private String orderId;
    /**
     * 是否成功
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * 错误码
     */
    @JsonProperty("code")
    private String code;

    /**
     * 错误信息
     */
    @JsonProperty("message")
    private String message;
    @JsonProperty("accountPeriod")
    private AccountPeriod accountPeriod;
    /**
     * 运费，单位：分，一次创建多个订单时，该字段为空
     */
    @JsonProperty("postFee")
    private Long postFee;

    /**
     * 一次创建多个订单
     */
    @JsonProperty("orderList")
    private List<OrderList> orderList;

    /**
     * 失败商品信息
     */
    @JsonProperty("failedOfferList")
    private List<FailedOffer> failedOfferList;


}
