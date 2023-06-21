package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/5 8:46
 */
@Getter
@Setter
public class ConsultPayoutDTO {
    /**
     * 转账到卡业务类型码。当 transferToDetail.transferToAmount.currency = CNY 时，此字段为必填。
     * <p>
     * 可取值如下：
     * THIRD_PARTY_PAYOUT：转账到第三方卡。第三方卡包括企业卡和个人卡。
     * SAME_NAME_PAYOUT：提现到同名卡。
     */
    private String businessSceneCode;
    /**
     * 支付方需要支付的转账到卡金额
     */
    private TransferFromDetail transferFromDetail;
    /**
     * 转账到卡细节，包括收款方可收到的金额等。
     */
    private TransferToDetail transferToDetail;

}
