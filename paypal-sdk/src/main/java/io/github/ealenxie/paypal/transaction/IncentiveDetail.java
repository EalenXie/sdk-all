package io.github.ealenxie.paypal.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * 激励详情
 * <p>
 * By Ashe
 */
@Getter
@Setter
public class IncentiveDetail {

    /**
     * 激励类型
     */
    @JsonProperty("incentive_type")
    private String incentiveType;

    /**
     * 激励代码
     */
    @JsonProperty("incentive_code")
    private String incentiveCode;

    /**
     * 奖励金额
     */
    @JsonProperty("incentive_amount")
    private Money incentiveAmount;

    /**
     * 激励计划的代码，确定一个商人的忠诚度或激励计划
     */
    @JsonProperty("incentive_program_code")
    private String incentiveProgramCode;
}
