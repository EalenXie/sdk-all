package io.github.ealenxie.fruugo.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/10 12:27
 */
@Getter
@Setter
public class FruugoOrderVO {
    /**
     * 客户订单编号
     */
    private String customerOrderId;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 下单日期
     */
    private String orderDate;
    /**
     * 订单发布日期
     */
    private String orderReleaseDate;
    /**
     * 订单状态
     * PENDING：尚未处理的新订单
     * PROCESSED：部分订单已处理
     * EXCEPTION：与订单相关的错误或手动更正
     */
    private String orderStatus;
    /**
     * 客户语言编码
     */
    private String customerLanguageCode;
    /**
     * 订单发货地址信息
     */
    private ShippingAddress shippingAddress;
    /**
     * 邮递方式
     */
    private String shippingMethod;
    /**
     * 运费含增值税
     */
    private String shippingCostInclVAT;
    /**
     * 运费增值税
     */
    private String shippingCostVAT;
    /**
     * orderLines
     */
    @JacksonXmlProperty(localName = "orderLines")
    private List<OrderLine> orderLines;

    /**
     * shipments
     */
    @JacksonXmlProperty(localName = "shipments")
    private List<Shipment> shipments;

    /**
     * Fruugo 是否负责收税并已对订单收税
     */
    private String fruugoTax;
    /**
     * Fruugo 税号
     */
    private String fruugoTaxID;
    /**
     * 经营者注册和识别号
     */
    private String fruugoEORI;
}
