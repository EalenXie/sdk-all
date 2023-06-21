package io.github.ealenxie.worldfirst.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/5 13:26
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransferLimitInfo {
    /**
     * 本次转账金额的最小额度。
     */
    @JsonProperty("currentTransferAmountLimitMin")
    private Amount currentTransferAmountLimitMin;
    /**
     * 本次转账金额的最大额度
     */
    @JsonProperty("currentTransferAmountLimitMax")
    private Amount currentTransferAmountLimitMax;
}
