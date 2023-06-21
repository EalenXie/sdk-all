package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/4/4 10:12
 */
@Getter
@Setter
public class BankAcceptance {

    /**
     * 出票日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 到期日期
     */
    @JsonProperty("validToDate")
    private String validToDate;
    /**
     * 票据状态
     */
    @JsonProperty("draftStatus")
    private String draftStatus;
    /**
     * 票据号码
     */
    @JsonProperty("draftNumber")
    private String draftNumber;
    /**
     * 出票人全称
     */
    @JsonProperty("issuerName")
    private String issuerName;
    /**
     * 出票人账号
     */
    @JsonProperty("issuerAccountNumber")
    private String issuerAccountNumber;
    /**
     * 出票人开户银行
     */
    @JsonProperty("issuerAccountBank")
    private String issuerAccountBank;
    /**
     * 收票人全称
     */
    @JsonProperty("payeeName")
    private String payeeName;
    /**
     * 收票人账号
     */
    @JsonProperty("payeeAccountNumber")
    private String payeeAccountNumber;
    /**
     * 收票人开户银行
     */
    @JsonProperty("payeeAccountBank")
    private String payeeAccountBank;
    /**
     * 票据金额大写
     */
    @JsonProperty("totalAmountInWords")
    private String totalAmountInWords;
    /**
     * 票据金额小写
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
    /**
     * 承兑人全称
     */
    @JsonProperty("acceptorName")
    private String acceptorName;
    /**
     * 承兑人账号
     */
    @JsonProperty("acceptorAccountNumber")
    private String acceptorAccountNumber;
    /**
     * 承兑人开户行行号
     */
    @JsonProperty("acceptorBankNumber")
    private String acceptorBankNumber;
    /**
     * 承兑人开户行名称
     */
    @JsonProperty("acceptorAccountBank")
    private String acceptorAccountBank;
    /**
     * 交易合同号
     */
    @JsonProperty("agreementNumber")
    private String agreementNumber;
    /**
     * 能否转让
     */
    @JsonProperty("assignability")
    private String assignability;
    /**
     * 承兑日期
     */
    @JsonProperty("acceptanceDate")
    private String acceptanceDate;

    /**
     * 子票区间号
     */
    @JsonProperty("subDraftNumber")
    private String subDraftNumber;
}
