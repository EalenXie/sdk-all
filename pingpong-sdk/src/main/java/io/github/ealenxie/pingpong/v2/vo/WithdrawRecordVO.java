package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author create by sch  2023/6/8 16:54
 * @version 1.0
 */
@Getter
@Setter
public class WithdrawRecordVO {

    /**
     * 提现流⽔号
     */
    @JsonProperty("withdrawId")
    private String withdrawId;
    /**
     * 客户ID
     */
    @JsonProperty("clientId")
    private String clientId;
    /**
     * 创建时间,unix时间戳（秒）
     */
    @JsonProperty("createTime")
    private Long createTime;
    /**
     * 提现⾦额
     */
    @JsonProperty("applyAmount")
    private BigDecimal applyAmount;
    /**
     * 提现币种
     */
    @JsonProperty("applyCurrency")
    private String applyCurrency;
    /**
     * 汇率
     */
    @JsonProperty("exchangeRate")
    private BigDecimal exchangeRate;
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
     * 费⽤列表
     */
    @JsonProperty("feeList")
    private List<FeeVO> feeList;
}
