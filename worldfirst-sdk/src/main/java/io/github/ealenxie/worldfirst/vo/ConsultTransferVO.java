package io.github.ealenxie.worldfirst.vo;

import io.github.ealenxie.worldfirst.dto.TransferFromDetail;
import io.github.ealenxie.worldfirst.dto.TransferToDetail;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/6 11:01
 */
@Getter
@Setter
public class ConsultTransferVO {
    /**
     * 代表API调用结果
     */
    private Result result;
    /**
     * 支付方需要支付的转账到卡金额
     */
    private TransferFromDetail transferFromDetail;
    /**
     * 转账到卡细节，包括收款方可收到的金额等。
     */
    private TransferToDetail transferToDetail;
}
