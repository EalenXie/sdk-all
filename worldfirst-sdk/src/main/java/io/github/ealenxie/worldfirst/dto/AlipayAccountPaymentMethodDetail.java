package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/9 11:19
 */
@Getter
@Setter
public class AlipayAccountPaymentMethodDetail {
    /**
     * 收款人类型，例如支付宝个人账户或企业账户。
     * <p>
     * 可取值如下：
     * THIRD_PARTY_ALIPAY_COMPANY_ACCOUNT: 收款人为第三方支付宝企业账户。
     * THIRD_PARTY_ALIPAY_PERSONAL_ACCOUNT:  收款人为第三方支付宝个人账户
     */
    private String beneficiaryType;
    /**
     * 支付宝账户名称
     */
    private String alipayAccountName;
    /**
     * 支付宝登录账号，可以是邮箱或手机号。
     * 邮箱：符合邮箱地址规则，字段不超过64位；
     * 手机：11位手机号
     */
    private String alipayAccountLogonId;
}
