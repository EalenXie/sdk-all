package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author create by sch  2023/6/8 17:03
 * @version 1.0
 */
@Getter
@Setter
public class WithdrawDetailVO {

    /**
     * 提现流⽔号
     */
    @JsonProperty("withdrawId")
    private String withdrawId;
    /**
     * 店铺扣款详情流⽔号
     */
    @JsonProperty("withdrawDetailId")
    private String withdrawDetailId;
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
     * 创建时间unix时间戳（秒）
     */
    @JsonProperty("createTime")
    private Long createTime;
    /**
     * 提现⾦额
     */
    @JsonProperty("withdrawAmount")
    private BigDecimal withdrawAmount;
    /**
     * 提现币种
     */
    @JsonProperty("withdrawCurrency")
    private String withdrawCurrency;
    /**
     * 优惠⾦额
     */
    @JsonProperty("promotionAmount")
    private BigDecimal promotionAmount;
    /**
     * 优惠币种
     */
    @JsonProperty("promotionCurrency")
    private String promotionCurrency;
    /**
     * 汇率
     */
    @JsonProperty("exchangeRate")
    private BigDecimal exchangeRate;
    /**
     * 本次提现平台费率
     */
    @JsonProperty("feeRate")
    private BigDecimal feeRate;
    /**
     * 到账⾦额
     */
    @JsonProperty("arrivalAmount")
    private BigDecimal arrivalAmount;
    /**
     * 到账币种
     */
    @JsonProperty("arrivalCurrency")
    private String arrivalCurrency;
    /**
     * 提现到账银⾏
     */
    @JsonProperty("bankName")
    private String bankName;
    /**
     * 提现到账银⾏账号
     */
    @JsonProperty("bankNumber")
    private String bankNumber;
    /**
     * 状态：
     * PENDING: 处理中
     * SUCCESS: 已完成
     * REFUND_TICKET: 已退票
     * REFUND: 已退款
     */
    @JsonProperty("status")
    private String status;
    /**
     * 费⽤列表
     */
    @JsonProperty("feeList")
    private List<FeeVO> feeList;
}
