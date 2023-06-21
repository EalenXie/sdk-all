package io.github.ealenxie.eccang.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/1/4 17:56
 */
@Getter
@Setter
public class PaymentAccountListDTO {

    /**
     * 支付方式 1:现金; 2:在线; 3:银行卡
     */
    private Integer pmId;

    /**
     * 支付平台（仅针对\"在线\"支付方式） 1:paypal; 2:财付通; 3:支付宝; 4:块钱; 5:网银; 6:微信; 7:诚e赊
     */
    private Integer platformType;

    /**
     * 银行名称 （仅针对\"银行卡\"支付方式）
     */
    private String platformName;

    /**
     * 账户
     */
    private String pmAccount;

    /**
     * 开户人
     */
    private String pmName;

    /**
     * 收款人
     */
    private String pmLead;

    /**
     * 收款公司
     */
    private String pmCompany;

    /**
     * 状态：0:停用、1:可用 ，默认：可用
     */
    private Integer pmStatus;
}
