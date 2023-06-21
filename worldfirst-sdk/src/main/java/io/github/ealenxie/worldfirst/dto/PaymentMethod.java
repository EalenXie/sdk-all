package io.github.ealenxie.worldfirst.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/5 9:20
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMethod {
    /**
     * 支付方式类型。可取值如下：
     * <p>
     * BENEFICIARY_TOKEN： 使用收款人的token做为支付方法(说明：加密字符串，包含收款人银行账户相关信息）
     * BANK_ACCOUNT_DETAIL：使用银行卡做为支付方法
     */
    private String paymentMethodType;
    /**
     * 支付ID
     * <p>
     * 更多信息：：
     * <p>
     * 当 paymentMethodType 字段取值为BENEFICIARY_TOKEN时，此字段为必填。其取值是调用bindBeneficiary API从而获取的beneficiaryToken  字段的值。
     * 当 paymentMethodType 字段取值为REFERENCE_ALIPAY_CN时，此字段为必填。其取值为referenceCustomerId字段的值。
     * 字段最大长度：128
     */
    private String paymentMethodId;
    /**
     * 支付细节，JSON 对象格式。
     * <p>
     * 更多信息：
     * <p>
     * 当paymentMethodType取值为BANK_ACCOUNT_DETAIL时，此字段为必填，此时该字段取值为 BankAccountPaymentMethodDetail.
     * 当paymentMethodType取值为ALIPAY_CN_DETAIL时，此字段为必填，此时该字段取值为 AlipayAccountPaymentMethodDetail.
     * 字段最大长度：2048
     */
    private String paymentMethodMetaData;
}
