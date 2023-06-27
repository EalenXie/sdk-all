package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.PagePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 12:21
 */
@Getter
@Setter
public class TopUpRecordPayload extends PagePayload {

    /**
     * 单号类型
     */
    @JsonProperty("code_field")
    private String codeField;
    /**
     * 字段值
     */
    @JsonProperty("code_value")
    private String codeValue;
    /**
     * 充值交易类型
     */
    @JsonProperty("transaction_type")
    private Integer transactionType;
    /**
     * 交易状态
     */
    @JsonProperty("transaction_gd_status")
    private Integer transactionGdStatus;
    /**
     * 账户编码
     */
    @JsonProperty("account_code")
    private String accountCode;
    /**
     * 付款银行名称
     */
    @JsonProperty("bank_name")
    private String bankName;
    /**
     * 充值开始日期
     */
    @JsonProperty("begin_add_time")
    private String beginAddTime;
    /**
     * 充值结束日期
     */
    @JsonProperty("end_add_time")
    private String endAddTime;

}
