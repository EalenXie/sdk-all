package io.github.ealenxie.worldfirst.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.worldfirst.dto.Amount;
import io.github.ealenxie.worldfirst.dto.TransferFromDetail;
import io.github.ealenxie.worldfirst.dto.TransferToDetail;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/5 8:45
 */
@Getter
@Setter
public class ConsultPayoutVO {
    @JsonProperty("result")
    private Result result;
    /**
     * 支付方需要支付的转账到卡金额
     */
    @JsonProperty("transferFromDetail")
    private TransferFromDetail transferFromDetail;
    /**
     * 转账到卡细节，包括收款方可收到的金额等
     */
    @JsonProperty("transferToDetail")
    private TransferToDetail transferToDetail;
    /**
     * 剩余可结汇额度
     */
    @JsonProperty("availableQuota")
    private Amount availableQuota;

}
