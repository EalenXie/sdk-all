package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 13:35
 */
@Setter
@Getter
public class OpOrderRefundModel {
    /**
     * 支付宝交易号
     */
    @JsonProperty("alipayPaymentId")
    private String alipayPaymentId;
    /**
     * 运费的申请退款金额，单位：分
     */
    @JsonProperty("applyCarriage")
    private BigDecimal applyCarriage;
    /**
     * 买家原始输入的退款金额(可以为空)
     */
    @JsonProperty("applyExpect")
    private BigDecimal applyExpect;

    /**
     * 买家申请退款金额，单位：分
     */
    @JsonProperty("applyPayment")
    private BigDecimal applyPayment;
    /**
     * 申请原因
     */

    @JsonProperty("applyReason")
    private String applyReason;
    /**
     * 申请原因ID
     */
    @JsonProperty("applyReasonId")
    private Integer applyReasonId;
    @JsonProperty("applySubReason")
    private String applySubReason;


    @JsonProperty("asynErrCode")
    private String asynErrCode;
    @JsonProperty("applySubReasonId")
    private Integer applySubReasonId;
    @JsonProperty("asynSubErrCode")
    private String asynSubErrCode;

    @JsonProperty("buyerAlipayId")
    private String buyerAlipayId;

    @JsonProperty("buyerLogisticsName")
    private String buyerLogisticsName;

    @JsonProperty("buyerMemberId")
    private String buyerMemberId;

    @JsonProperty("buyerUserId")
    private Long buyerUserId;

    @JsonProperty("canRefundPayment")
    private BigDecimal canRefundPayment;

    @JsonProperty("disburseChannel")
    private String disburseChannel;

    @JsonProperty("disputeRequest")
    private Integer disputeRequest;
    @JsonProperty("disputeType")
    private Integer disputeType;

    @JsonProperty("extInfo")
    private ExtInfo extInfo;


    @JsonProperty("freightBill")
    private String freightBill;


    @JsonProperty("frozenFund")
    private BigDecimal frozenFund;


    @JsonProperty("gmtApply")
    private String gmtApply;


    @JsonProperty("gmtCompleted")
    private String gmtCompleted;

    @JsonProperty("gmtCreate")
    private String gmtCreate;


    @JsonProperty("gmtFreezed")
    private String gmtFreezed;


    @JsonProperty("gmtModified")
    private String gmtModified;


    @JsonProperty("gmtTimeOut")
    private String gmtTimeOut;


    @JsonProperty("goodsStatus")
    private Integer goodsStatus;


    @JsonProperty("id")
    private Long id;
    @JsonProperty("instantRefundType")
    private String instantRefundType;

    @JsonProperty("orderEntryCountMap")
    private Map<Object, Object> orderEntryCountMap;


    @JsonProperty("orderEntryIdList")
    private List<Object> orderEntryIdList;


    @JsonProperty("orderId")
    private Long orderId;


    @JsonProperty("prepaidBalance")
    private Long prepaidBalance;

    @JsonProperty("productName")
    private String productName;
    @JsonProperty("refundCarriage")
    private BigDecimal refundCarriage;

    @JsonProperty("refundId")
    private String refundId;

    @JsonProperty("refundPayment")
    private BigDecimal refundPayment;
    @JsonProperty("rejectReason")
    private String rejectReason;


    @JsonProperty("rejectReasonId")
    private Integer rejectReasonId;
    @JsonProperty("rejectTimes")
    private Integer rejectTimes;

    @JsonProperty("sellerAlipayId")
    private String sellerAlipayId;

    @JsonProperty("sellerMemberId")
    private String sellerMemberId;


    @JsonProperty("sellerMobile")
    private String sellerMobile;
    @JsonProperty("sellerRealName")
    private String sellerRealName;


    @JsonProperty("sellerReceiveAddress")
    private String sellerReceiveAddress;


    @JsonProperty("sellerTel")
    private String sellerTel;

    @JsonProperty("sellerUserId")
    private Long sellerUserId;

    @JsonProperty("status")
    private String status;

    @JsonProperty("taskStatus")
    private String taskStatus;

    @JsonProperty("timeOutOperateType")
    private String timeOutOperateType;

    @JsonProperty("tradeTypeStr")
    private String tradeTypeStr;

    @JsonProperty("success")
    private Boolean success;
    /**
     * 操作记录列表
     */
    @JsonProperty("refundOperationList")
    private List<RefundOperation> refundOperationList;

    @JsonProperty("buyerLoginId")
    private String buyerLoginId;

    @JsonProperty("sellerLoginId")
    private String sellerLoginId;

    @JsonProperty("isCrmModifyRefund")
    private Boolean isCrmModifyRefund;

    @JsonProperty("isTimeOutFreeze")
    private Boolean isTimeOutFreeze;

    @JsonProperty("isInsufficientAccount")
    private Boolean isInsufficientAccount;

    @JsonProperty("isGoodsReceived")
    private Boolean isGoodsReceived;

    @JsonProperty("isOnlyRefund")
    private Boolean isOnlyRefund;

    @JsonProperty("isRefundGoods")
    private Boolean isRefundGoods;

    @JsonProperty("isSellerDelayDisburse")
    private Boolean isSellerDelayDisburse;

    @JsonProperty("isAftersaleAutoDisburse")
    private Boolean isAftersaleAutoDisburse;

    @JsonProperty("isSupportNewSteppay")
    private Boolean isSupportNewSteppay;

    @JsonProperty("isNewRefundReturn")
    private Boolean isNewRefundReturn;

    @JsonProperty("isBuyerSendGoods")
    private Boolean isBuyerSendGoods;

    @JsonProperty("isAftersaleAgreeTimeout")
    private Boolean isAftersaleAgreeTimeout;

    @JsonProperty("isInsufficientBail")
    private Boolean isInsufficientBail;


}
