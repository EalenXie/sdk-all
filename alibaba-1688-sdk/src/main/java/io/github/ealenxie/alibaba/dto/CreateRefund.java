package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月16日 0016 13 35
 */
@Getter
@Setter
public class CreateRefund {
    /**
     * 主订单
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("orderId")
    private Long orderId;
    /**
     * 子订单
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("orderEntryIds")
    private List<Long> orderEntryIds;
    /**
     * 退款/退款退货。只有已收到货，才可以选择退款退货。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("disputeRequest")
    private String disputeRequest;
    /**
     * 退款金额（单位：分）。不大于实际付款金额；等待卖家发货时，必须为商品的实际付款金额。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("applyPayment")
    private Long applyPayment;
    /**
     * 退运费金额（单位：分）。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("applyCarriage")
    private Long applyCarriage;
    /**
     * 退款原因id（从API getRefundReasonList获取）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("applyReasonId")
    private Long applyReasonId;
    /**
     * 退款申请理由，2-150字
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("description")
    private String description;
    /**
     * 货物状态
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("goodsStatus")
    private String goodsStatus;
    /**
     * 凭证图片URLs。1-5张，必须使用API uploadRefundVoucher返回的“图片域名/相对路径”
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("vouchers")
    private String[] vouchers;
    /**
     * 子订单退款数量。仅在售中买家已收货（退款退货）时，可指定退货数量；默认，全部退货。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("orderEntryCountList")
    private List<OrderEntryCount> orderEntryCountList;
}
