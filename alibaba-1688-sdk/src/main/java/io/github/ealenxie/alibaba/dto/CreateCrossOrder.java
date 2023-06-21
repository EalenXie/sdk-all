package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 9:02
 */
@Setter
@Getter
public class CreateCrossOrder {
    /**
     * general（创建大市场订单），saleproxy（创建分销订单）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("flow")
    private String flow;
    /**
     * 留言
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("message")
    private String message;
    /**
     * 由于不同的商品支持的交易方式不同，没有一种交易方式是全局通用的，
     * 所以当前下单可使用的交易方式必须通过下单预览接口的tradeModeNameList获取。
     * 交易方式类型说明：fxassure（交易4.0通用担保交易），alipay（大市场通用的支付宝担保交易（目前在做切流，后续会下掉）），
     * period（普通账期交易）, assure（大买家企业采购询报价下单时需要使用的担保交易流程）,
     * creditBuy（诚E赊），bank（银行转账），631staged（631分阶段付款），37staged（37分阶段）；
     * 此字段不传则系统默认会选取一个可用的交易方式下单，如果开通了诚E赊默认是creditBuy（诚E赊），未开通诚E赊默认使用的方式是支付宝担宝交易。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tradeType")
    private String tradeType;
    /**
     * 店铺优惠ID，通过“创建订单前预览数据接口”获得。为空默认使用默认优惠
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("shopPromotionId")
    private String shopPromotionId;
    /**
     * 是否匿名下单
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("anonymousBuyer")
    private String anonymousBuyer;
    /**
     * 收货地址信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("addressParam")
    private AddressParam addressParam;
    /**
     * 商品信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("cargoParamList")
    private List<CargoParam> cargoParamList;
    /**
     * 发票信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("invoiceParam")
    private InvoiceParam invoiceParam;


}
