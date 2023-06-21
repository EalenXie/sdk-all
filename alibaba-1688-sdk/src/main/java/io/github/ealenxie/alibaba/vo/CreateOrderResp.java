package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 9:58
 */
@Setter
@Getter
public class CreateOrderResp {

    /**
     * 订单预览结果，过自动拆单会返回多个记录
     */
    @JsonProperty("orderPreviewResuslt")
    private List<OrderPreviewResuslt> orderPreviewResuslt;


    /**
     * 是否成功
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * 错误码
     */
    @JsonProperty("errorCode")
    private String errorCode;

    /**
     * 错误信息
     */
    @JsonProperty("errorMsg")
    private String errorMsg;
    /**
     * 运费说明的商品列表
     */
    @JsonProperty("postFeeByDescOfferList")
    private Long[] postFeeByDescOfferList;
    /**
     * 代销商品列表
     */
    @JsonProperty("consignOfferList")
    private Long[] consignOfferList;

    /**
     * 不支持跨境宝支付的商品列表
     */
    @JsonProperty("unsupportedCrossBorderPayOfferList")
    private Long[] unsupportedCrossBorderPayOfferList;

}
