package io.github.ealenxie.worldfirst.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/6 11:01
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConsultTransferDTO {
    /**
     * 支付方需要支付的转账到卡金额
     */
    private TransferFromDetail transferFromDetail;
    /**
     * 转账到卡细节，包括收款方可收到的金额等。
     */
    private TransferToDetail transferToDetail;
}
