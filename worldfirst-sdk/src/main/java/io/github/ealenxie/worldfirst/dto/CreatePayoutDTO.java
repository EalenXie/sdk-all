package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/6 11:04
 */
@Getter
@Setter
public class CreatePayoutDTO {
    /**
     * 由集成商定义的唯一转账代发识别ID。
     * <p>
     * 更多信息：
     * <p>
     * 此字段为幂等字段
     * 字段最大长度：64
     */
    private String transferRequestId;
    /**
     * 支付方需要支付的转账代发金额
     */
    private TransferFromDetail transferFromDetail;
    /**
     * 转账代发细节，包括收款方可收到的金额等。
     */
    private TransferToDetail transferToDetail;
    /**
     * 转账到卡业务类型码。当 transferToDetail.transferToAmount.currency = CNY 时，此字段为必填。
     * <p>
     * 可取值如下：
     * <p>
     * THIRD_PARTY_PAYOUT：转账到第三方卡。第三方卡包括企业卡和个人卡。
     * SAME_NAME_PAYOUT：提现到同名卡。
     */
    private String businessSceneCode;
    /**
     * 转账代发的更多信息，包括支付方和收款方的信息等
     */
    private TransferOrderAddition transferOrderAddition;
}
