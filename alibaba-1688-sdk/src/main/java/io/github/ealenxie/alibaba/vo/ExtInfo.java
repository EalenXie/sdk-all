package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/16 14:04
 */
@Setter
@Getter
public class ExtInfo {

    /**
     * eXmrf
     */
    @JsonProperty("EXmrf")
    private String eXmrf;
    /**
     * ttid
     */
    private String ttid;
    /**
     * prepaidFailure
     */
    private String prepaidFailure;
    /**
     * payLock
     */
    @JsonProperty("pay_lock")
    private String payLock;
    /**
     * reason
     */
    private String reason;
    /**
     * applyTextId
     */
    @JsonProperty("apply_text_id")
    private String applyTextId;
    /**
     * newRefund
     */
    private String newRefund;
    /**
     * bizCode
     */
    private String bizCode;
    /**
     * disputeTradeStatus
     */
    private String disputeTradeStatus;
    /**
     * lastOrder
     */
    private String lastOrder;
    /**
     * sellerAgreedRefundFee
     */
    @JsonProperty("seller_agreed_refund_fee")
    private String sellerAgreedRefundFee;
    /**
     * oldReasonId
     */
    @JsonProperty("old_reason_id")
    private String oldReasonId;
    /**
     * sync
     */
    private String sync;
    /**
     * b2bSellerMId
     */
    @JsonProperty("b2b_seller_mId")
    private String b2bSellerMId;
    /**
     * seller_batch
     */
    @JsonProperty("seller_batch")
    private String sellerBatch;
    /**
     * itemBuyAmount
     */
    private String itemBuyAmount;
    /**
     * b2bBuyerMId
     */
    @JsonProperty("b2b_buyer_mId")
    private String b2bBuyerMId;
    /**
     * ability
     */
    private String ability;
    /**
     * refundPostFee
     */
    private String refundPostFee;
    /**
     * sellerAudit
     */
    @JsonProperty("seller_audit")
    private String sellerAudit;
    /**
     * eeTraceId
     */
    @JsonProperty("ee_trace_id")
    private String eeTraceId;
    /**
     * olTf
     */
    @JsonProperty("ol_tf")
    private String olTf;
    /**
     * opRole
     */
    private String opRole;
    /**
     * applyInitRefundFee
     */
    @JsonProperty("apply_init_refund_fee")
    private String applyInitRefundFee;
    /**
     * isVirtual
     */
    private String isVirtual;
    /**
     * logisticsCompanyId
     */
    private String logisticsCompanyId;
    /**
     * itemPrice
     */
    private String itemPrice;
    /**
     * interceptStatus
     */
    private String interceptStatus;
    /**
     * refundFrom
     */
    private String refundFrom;
    /**
     * restartForXiaoer
     */
    private String restartForXiaoer;
    /**
     * appName
     */
    private String appName;
    /**
     * abnormalDisputeStatus
     */
    @JsonProperty("abnormal_dispute_status")
    private String abnormalDisputeStatus;
    /**
     * payMode
     */
    private String payMode;
    /**
     * workflowName
     */
    private String workflowName;
    /**
     * sgr
     */
    private String sgr;
    /**
     * enfunddetail
     */
    private String enfunddetail;
    /**
     * sellerDoRefundNick
     */
    private String sellerDoRefundNick;
    /**
     * bgmtc
     */
    private String bgmtc;
}
