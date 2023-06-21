package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 10:03
 */
@Setter
@Getter
public class OrderPreviewResuslt {
    /**
     * 计算完货品金额后再次进行的减免金额. 单位: 分
     */
    @JsonProperty("discountFee")
    private Long discountFee;
    /**
     * 当前交易在使用下单接口时可以支持的交易方式列表，其中的元素可以直接用于下单接口的tradeType入参。列表为空，当前交易不可通过接口下单，需要在1688页面下单。
     */
    @JsonProperty("tradeModeNameList")
    private String[] tradeModeNameList;
    /**
     * 状态
     */
    @JsonProperty("status")
    private Boolean status;
    /**
     * 是否有淘货源单品优惠 false:有单品优惠 true：没有单品优惠
     */
    @JsonProperty("taoSampleSinglePromotion")
    private Boolean taoSampleSinglePromotion;
    /**
     * 订单总费用, 单位为分
     */
    @JsonProperty("sumPayment")
    private Long sumPayment;
    /**
     * 返回信息
     */
    @JsonProperty("message")
    private String message;
    /**
     * 总运费信息, 单位为分.
     */
    @JsonProperty("sumCarriage")
    private Long sumCarriage;
    /**
     * 返回码
     */
    @JsonProperty("resultCode")
    private String resultCode;
    /**
     * 不包含运费的货品总费用, 单位为分.
     */
    @JsonProperty("sumPaymentNoCarriage")
    private Long sumPaymentNoCarriage;
    /**
     * 附加费,单位，分
     */
    @JsonProperty("additionalFee")
    private Long additionalFee;
    /**
     * 订单下单流程
     */
    @JsonProperty("flowFlag")
    private String flowFlag;
    /**
     * 规格信息
     */
    @JsonProperty("cargoList")
    private List<Cargo> cargoList;

    /**
     * 可用店铺级别优惠列表
     */
    @JsonProperty("shopPromotionList")
    private List<ShopPromotion> shopPromotionList;
    /**
     * 优惠券描述
     */
    @JsonProperty("tradeModelList")
    private List<TradeModel> tradeModelList;

}
