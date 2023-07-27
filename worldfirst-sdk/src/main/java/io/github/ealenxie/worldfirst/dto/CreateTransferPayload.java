package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/5 15:04
 */
@Getter
@Setter
public class CreateTransferPayload {
    /**
     * 由集成商定义的唯一转账代发识别ID。
     *
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
     * 转账代发的更多信息，包括支付方和收款方的信息等
     */
    private TransferOrderAddition transferOrderAddition;
}
