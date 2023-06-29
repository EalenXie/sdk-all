package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * fop	拓展字段
 */
@Getter
@Setter
public class ExtendFields {

    /**
     * 客户交易订单号（电商平台的交易单号）
     */
    @JsonProperty("ReferenceNo")
    private String referenceNo;
    /**
     * 支付企业名称
     */
    @JsonProperty("PayCompany")
    private String payCompany;
    /**
     * 支付企业在跨境公共平台备案后获得的备案编号
     */
    @JsonProperty("PayCompanyNo")
    private String payCompanyNo;
    /**
     * 运费（电商平台收产生的运费
     */
    @JsonProperty("Freight")
    private Double freight;
    /**
     * 是否保价(0：否，1：是，电商平台对客户是否保价) 默认为否
     */
    @JsonProperty("IsValuation")
    private String isValuation;
    /**
     * 保价价值(保价时必填，不填为0)
     */
    @JsonProperty("ValuationValue")
    private String valuationValue;
    /**
     * 保价费（保价时必填，不填为0
     */
    @JsonProperty("ValuationFee")
    private Double valuationFee;
    /**
     * 订单交易时间（电商平台的订单交易时间）
     */
    @JsonProperty("OrderTime")
    private Long orderTime;
    /**
     * 订单税金，精确 2 位小数（电商平台产生的税费）
     */
    @JsonProperty("TaxAmount")
    private Double taxAmount;
    /**
     * 优惠金额（电商平台的优惠金额，不填为0)
     */
    @JsonProperty("Discount")
    private Double discount;
    /**
     * 订单抵扣金额
     */
    @JsonProperty("DeductionAmount")
    private String deductionAmount;
    /**
     * 实际支付金额
     */
    @JsonProperty("ActualAmount")
    private String actualAmount;
    /**
     * 订单类型 1:普通订单 2：高值订单（默认为普通订单）
     */
    @JsonProperty("OrderType")
    private String orderType;
    /**
     * 国际主单号，当订单类型为高值订单时必填
     */
    @JsonProperty("InterBillNo")
    private String interBillNo;
    /**
     * 订购人平台号
     */
    @JsonProperty("BuyerRegNo")
    private String buyerRegNo;
    /**
     * 订单人姓名(非收件人，订购人)
     */
    @JsonProperty("OrderName")
    private String orderName;
    /**
     * 订单人电话(非收件人，订购人)
     */
    @JsonProperty("OrderPhone")
    private String orderPhone;
    /**
     * 订单人身份证号(非收件人，订购人)
     */
    @JsonProperty("OrderCardNo")
    private String orderCardNo;
}
