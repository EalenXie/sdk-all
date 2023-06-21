package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/30 14:01
 */
@Getter
@Setter
public class BankInfo {
    /**
     * 收款账号
     */
    @JsonProperty("card")
    private String card;
    /**
     * 收款账号对应的IBAN
     */
    @JsonProperty("iban")
    private String iban;
    /**
     * 银⾏名称
     */
    @JsonProperty("bank_name")
    private String bankName;
    /**
     * 银⾏代码
     */
    @JsonProperty("bank_code")
    private String bankCode;
    /**
     * 分⾏代码
     */
    @JsonProperty("branch_number")
    private String branchNumber;
    /**
     * 银⾏识别代码
     */
    @JsonProperty("sort_code")
    private String sortCode;
    /**
     *
     */
    @JsonProperty("zip_code")
    private String zipCode;
    /**
     * 汇款路线号码
     */
    @JsonProperty("routing_number")
    private String routingNumber;
    /**
     * 银⾏汇款号码
     */
    @JsonProperty("swift_code")
    private String swiftCode;
    /**
     * 账户类型 Checking/Saving
     */
    @JsonProperty("account_type")
    private String accountType;
}
