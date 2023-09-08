package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author lanzhi
 * Created on 2023/7/31 16:12
 **/
@Getter
@Setter
public class PayToDetail {
    /**
     * 支付金额
     */
    private Amount payToAmount;
    /**
     * 收款方信息，包括收款方式类型、收款ID等
     */
    private BeneficiaryInfo beneficiaryInfo;
    /**
     * 手续费金额
     */
    private Amount feeAmount;
    /**
     * 账单中要求在付款时添加的备注信息。
     * <p>
     * 字段最大长度：70
     */
    private String remark;
    /**
     * 用于接收支付结果通知的地址。
     * <p>
     * 字段最大长度：128
     */
    private String paymentNotifyUrl;
    /**
     * 支付超时时间。
     * 此字段赋值应遵循 ISO 8601 格式，
     * 例如：2020-01-01T23:59:59+08:00
     */
    private Date expireTime;
}

