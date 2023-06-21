package io.github.ealenxie.worldfirst.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/5 14:26
 */
@Getter
@Setter
public class FundMoveDetail {
    /**
     * 付款人姓名。万里汇以脱敏形式透出此数据。此字段在StatementList.transactionType为以下取值时，有可能透出：
     * <p>
     * COLLECTION
     * COLLECTION_REFUND
     * TRANSFER
     * TRANSFER_REFUND
     * WITHDRAWAL
     * WITHDRAWAL_REFUND
     * CONVERSION
     * CONVERSION_DEAL
     * CHARGE
     * CHARGE_REFUND
     * DEDUCTION
     * FUND_COLLECTION
     * 更多信息：
     * <p>
     * 字段最大长度：128
     */
    private String payerName;
    /**
     * 付款人账号。万里汇以脱敏形式透出此数据。此字段在StatementList.transactionType为以下取值时，有可能透出：
     * <p>
     * COLLECTION
     * COLLECTION_REFUND
     * TRANSFER
     * TRANSFER_REFUND
     * WITHDRAWAL
     * WITHDRAWAL_REFUND
     * CONVERSION
     * CONVERSION_DEAL
     * CHARGE
     * CHARGE_REFUND
     * DEDUCTION
     * FUND_COLLECTION
     * 更多信息：
     * <p>
     * 字段最大长度：64
     */
    private String payerAccountNo;
    /**
     * 付款人账户类型。万里汇以脱敏形式透出此数据。此字段在StatementList.transactionType为以下取值时，有可能透出：
     * <p>
     * COLLECTION
     * COLLECTION_REFUND
     * TRANSFER
     * TRANSFER_REFUND
     * WITHDRAWAL
     * WITHDRAWAL_REFUND
     * CONVERSION
     * CONVERSION_DEAL
     * CHARGE
     * CHARGE_REFUND
     * DEDUCTION
     * FUND_COLLECTION
     * 取值范围：
     * <p>
     * WORLDFIRST
     * BANK_CARD
     * VIRTUAL_ACCOUNT
     * ALIPAY_CN
     * MINI_ACCOUNT
     * INST_ACCOUNT
     * INNER_ACCOUNT
     */
    private String payerAccountType;
    /**
     * 收款人姓名，同收款人账号户主名。万里汇以脱敏形式透出此数据。此字段在StatementList.transactionType为以下取值时，有可能透出：
     * <p>
     * COLLECTION
     * COLLECTION_REFUND
     * TRANSFER
     * TRANSFER_REFUND
     * WITHDRAWAL
     * WITHDRAWAL_REFUND
     * CONVERSION
     * CONVERSION_DEAL
     * CHARGE
     * CHARGE_REFUND
     * DEDUCTION
     * FUND_COLLECTION
     * 更多信息：
     * <p>
     * 字段最大长度：128
     */
    private String beneficiaryName;
    /**
     * 收款人账号。万里汇以脱敏形式透出此数据。此字段在StatementList.transactionType为以下取值时，有可能透出：
     * <p>
     * COLLECTION
     * COLLECTION_REFUND
     * TRANSFER
     * TRANSFER_REFUND
     * WITHDRAWAL
     * WITHDRAWAL_REFUND
     * CONVERSION
     * CONVERSION_DEAL
     * CHARGE
     * CHARGE_REFUND
     * DEDUCTION
     * FUND_COLLECTION
     * 更多信息：
     * <p>
     * 字段最大长度：64
     */
    private String beneficiaryAccountNo;
    /**
     * 收款人账户类型。万里汇以脱敏形式透出此数据。此字段在StatementList.transactionType为以下取值时，有可能透出：
     * <p>
     * COLLECTION
     * COLLECTION_REFUND
     * TRANSFER
     * TRANSFER_REFUND
     * WITHDRAWAL
     * WITHDRAWAL_REFUND
     * CONVERSION
     * CONVERSION_DEAL
     * CHARGE
     * CHARGE_REFUND
     * DEDUCTION
     * FUND_COLLECTION
     * 取值范围：
     * <p>
     * WORLDFIRST
     * BANK_CARD
     * VIRTUAL_ACCOUNT
     * ALIPAY_CN
     * MINI_ACCOUNT
     * INST_ACCOUNT
     * INNER_ACCOUNT
     */
    private String beneficiaryAccountType;
    /**
     * 收款人账户所在国家/地区。万里汇以脱敏形式透出此数据。此字段在StatementList.transactionType为以下取值时，有可能透出：
     * <p>
     * COLLECTION
     * COLLECTION_REFUND
     * TRANSFER
     * TRANSFER_REFUND
     * WITHDRAWAL
     * WITHDRAWAL_REFUND
     * CONVERSION
     * CONVERSION_DEAL
     * CHARGE
     * CHARGE_REFUND
     * DEDUCTION
     * FUND_COLLECTION
     * 更多信息：
     * <p>
     * 字段最大长度：64
     */
    private String beneficiaryBankCountry;
    /**
     * 收款人账户所属银行名称。万里汇以脱敏形式透出此数据。此字段在StatementList.transactionType为以下取值时，有可能透出：
     * <p>
     * COLLECTION
     * COLLECTION_REFUND
     * TRANSFER
     * TRANSFER_REFUND
     * WITHDRAWAL
     * WITHDRAWAL_REFUND
     * CONVERSION
     * CONVERSION_DEAL
     * CHARGE
     * CHARGE_REFUND
     * DEDUCTION
     * FUND_COLLECTION
     * 更多信息：
     * <p>
     * 字段最大长度：256
     */
    private String beneficiaryBankName;
    /**
     * 收款人店铺名。当StatementList.transactionType 字段取值为 COLLECTION时，此字段有可能透出。
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：512
     */
    private String beneficiaryStoreName;
    /**
     * 集成商在Marketplace上的注册名。当StatementList.transactionType 字段取值为 COLLECTION时，此字段有可能透出。
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：512
     */
    private String beneficiaryMarketplaceName;
    /**
     * 转账附言
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：512
     */
    private String remarks;
    /**
     * 由用户提供的交易描述信息
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：512
     */
    private String description;
    /**
     * RA或VA账号。
     * <p>
     * 当StatementList.transactionType 字段取值为 COLLECTION时，此字段有可能透出。
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：128
     */
    private String receiveAccount;
}
