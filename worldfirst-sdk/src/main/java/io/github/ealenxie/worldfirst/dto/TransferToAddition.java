package io.github.ealenxie.worldfirst.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/6 10:38
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransferToAddition {
    /**
     * 收款明细请求ID
     */
    private String transferToRequestId;
    /**
     * 收款人信息
     */
    private TransferBeneficiary transferBeneficiary;
}
