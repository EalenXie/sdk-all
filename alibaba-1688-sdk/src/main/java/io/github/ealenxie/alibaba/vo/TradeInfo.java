package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.ealenxie.alibaba.deser.AlibabaResponseDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


/**
 * @author 无敌暴龙战士
 * @since 2022/12/15 13:43
 */
@Setter
@Getter
public class TradeInfo {
    /**
     * 订单基础信息
     */
    private BaseInfo baseInfo;
    /**
     * 订单业务信息
     */
    private OrderBizInfo orderBizInfo;
    /**
     * 交易条款
     */
    private List<TradeTerm> tradeTerms;
    /**
     * 商品条目信息
     */
    private List<ProductItem> productItems;
    /**
     * 国内物流
     */
    private NativeLogistics nativeLogistics;
    /**
     * 发票信息
     */
    private OrderInvoiceInfo orderInvoiceInfo;
    /**
     * 保障条款
     */
    @JsonDeserialize(using = AlibabaResponseDeserializer.class)
    private List<GuaranteesTerm> guaranteesTerms;
    /**
     * 订单评价信息
     */
    private OrderRateInfo orderRateInfo;
    /**
     * 跨境地址扩展信息
     */
    private OverseasExtraAddress overseasExtraAddress;
    /**
     * 跨境报关信息
     */
    private Customs customs;
    /**
     * 采购单详情列表，为大企业采购订单独有域。
     */
    private List<PurchaseQuote> quoteList;
    /**
     * 订单扩展属性
     */
    private List<ExtAttribute> extAttributes;

}
