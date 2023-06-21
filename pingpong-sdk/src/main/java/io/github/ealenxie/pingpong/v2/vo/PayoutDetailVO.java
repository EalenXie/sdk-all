package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author create by sch  2023/6/8 17:29
 * @version 1.0
 */
@Getter
@Setter
public class PayoutDetailVO {

    /**
     * 流⽔号
     */
    @JsonProperty("payoutId")
    private String payoutId;
    /**
     * 扣款店铺明细流⽔号
     */
    @JsonProperty("payoutDetailId")
    private String payoutDetailId;
    /**
     * 客户ID
     */
    @JsonProperty("clientId")
    private String clientId;
    /**
     * 平台CODE
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 店铺收款账户ID
     */
    @JsonProperty("accountId")
    private String accountId;
    /**
     * 店铺名称
     */
    @JsonProperty("storeName")
    private String storeName;
    /**
     * 店铺所在地区
     */
    @JsonProperty("nation")
    private String nation;
    /**
     * 创建时间，unix时间戳（秒）
     */
    @JsonProperty("createTime")
    private Long createTime;
    /**
     * 付款⾦额
     */
    @JsonProperty("applyAmount")
    private BigDecimal applyAmount;
    /**
     * 付款币种
     */
    @JsonProperty("applyCurrency")
    private String applyCurrency;
    /**
     * 汇率
     */
    @JsonProperty("exchangeRate")
    private BigDecimal exchangeRate;
    /**
     * 扣款⾦额
     */
    @JsonProperty("deductAmount")
    private BigDecimal deductAmount;
    /**
     * 扣款币种
     */
    @JsonProperty("deductCurrency")
    private String deductCurrency;
    /**
     * 收款⽅户名
     */
    @JsonProperty("receiverName")
    private String receiverName;
    /**
     * 收款⽅账号
     */
    @JsonProperty("receiverAccount")
    private String receiverAccount;
    /**
     * 付款类型：
     * SUPPLIER_PAY:供应商付款
     * VAT_PAY： VAT缴税
     * FLOW_MORE:退税服务
     * HEDGINGX:HedgingX
     * FX_PAY:福鑫充值
     * VAT_FILING:VAT报税
     * VAT_REGISTER:VAT注册
     * AMAZON_ADDED_SERVICE:亚⻢逊增值服务
     * CERTIFICATION_SERVICE_PROVIDER:认证服务商
     * VCC_RECHARGE:增值服务(VCC充值)
     * ADS_PAY:⼴告服务
     */
    @JsonProperty("payoutType")
    private String payoutType;
    /**
     * 费⽤列表
     */
    @JsonProperty("feeList")
    private List<FeeVO> feeList;
}
