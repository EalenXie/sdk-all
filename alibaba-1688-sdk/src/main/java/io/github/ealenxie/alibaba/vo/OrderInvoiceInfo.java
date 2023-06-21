package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/15 14:04
 */
@Setter
@Getter
public class OrderInvoiceInfo {
    /**
     * 发票公司名称(即发票抬头-title)
     */
    private String invoiceCompanyName;
    /**
     * 发票类型. 0：普通发票，1:增值税发票，9未知类型
     */
    private Integer invoiceType;
    /**
     * 本地发票号
     */
    private Long localInvoiceId;
    /**
     * 订单Id
     */
    private Long orderId;
    /**
     * (收件人)址区域编码
     */
    private String receiveCode;
    /**
     * (收件人) 省市区编码对应的文案(增值税发票信息)
     */
    private String receiveCodeText;
    /**
     * （收件者）发票收货人手机
     */
    private String receiveMobile;
    /**
     * （收件者）发票收货人
     */
    private String receiveName;
    /**
     * （收件者）发票收货人电话
     */
    private String receivePhone;
    /**
     * （收件者）发票收货地址邮编
     */
    private String receivePost;
    /**
     * (收件人) 街道地址(增值税发票信息)
     */
    private String receiveStreet;
    /**
     * (公司)银行账号
     */
    private String registerAccountId;
    /**
     * (公司)开户银行
     */
    private String registerBank;
    /**
     * (注册)省市区编码
     */
    private String registerCode;
    /**
     * (注册)省市区文本
     */
    private String registerCodeText;
    /**
     * （公司）注册电话
     */
    private String registerPhone;
    /**
     * (注册)街道地址
     */
    private String registerStreet;
    /**
     * 纳税人识别号
     */
    private String taxpayerIdentify;
}
