package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/9 11:15
 */
@Getter
@Setter
public class BankAccountPaymentMethodDetail {
    /**
     * 银行所在国家/地区的二字母代码。遵循 ISO-3166 标准。例如 EU, ED 。
     */
    private String bankCountryCode;
    /**
     * 银行账号。当 bankCountryCode 取值非EU时此字段为必填。
     * 规则：{"checkRules": "^[A-Z0-9]{0,34}$"}
     * 字段最大长度：64
     */
    private String bankAccountNo;
    /**
     * 收款人银行的的IBAN信息。当 bankCountryCode 为EU时此字段为必填。
     * 规则：{"checkRules": "^[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}$"}
     * 字段最大长度：34
     */
    private String bankAccountIBAN;
    /**
     * 收款人银行的的IBAN信息。当 bankCountryCode 为EU时此字段为必填。
     * 规则：{"checkRules": "^[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}$"}
     * 字段最大长度：34
     */
    private String beneficiaryType;
    /**
     * 收款人账户姓名（本地语言）。当 transferToDetail.transferToAmount.currency = CNY 时，此字段为必填
     */
    private String bankAccountLocalName;
    /**
     * 收款银行名（本地语言）。当 transferToDetail.transferToAmount.currency = CNY 时，此字段为必填。
     */
    private String bankLocalName;
    /**
     * 汇款路径代码，比如ABA、BSB（适用于汇款澳元/新西兰元至澳洲）、Sort Code（适用于汇款英镑至英国）等。
     * <p>
     * 当 transferToDetai.transferToAmount.currency = CNY 且 beneficiaryType = THIRD_PARTY_COMPANY_BANK_ACCOUNT时，此字段为必填，且赋值为收款行的支行联行号，如
     */
    private String routingNumber;
    /**
     * 银行账户名称。
     * <p>
     * 规则：{"checkRules": "^[A-Za-z0-9_,()\\s.,]{0,70}$"}
     * 字段最大长度：70
     */
    private String bankAccountName;
    /**
     * 银行名称。
     */
    private String bankName;
    /**
     * 银行分行名称
     */
    private String branchBankName;
    /**
     * 银行地址
     */
    private Address bankAddress;
    /**
     * 银行的BIC代码，长度为8-11位。
     * 规则：{"checkRules": "^[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}$"}
     * 字段最大长度：11
     */
    private String bankBIC;
    /**
     * 收款人地址。
     */
    private String beneficiaryAddress;
    /**
     * 代表收款人所在国家/地区的二字母ISO-3166 代码
     */
    private String beneficiaryCountryCode;
}
