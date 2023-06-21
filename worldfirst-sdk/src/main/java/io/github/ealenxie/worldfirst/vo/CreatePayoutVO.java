package io.github.ealenxie.worldfirst.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.worldfirst.dto.TransferFromDetail;
import io.github.ealenxie.worldfirst.dto.TransferOrderAddition;
import io.github.ealenxie.worldfirst.dto.TransferToDetail;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/6 11:04
 */
@Getter
@Setter
public class CreatePayoutVO {
    @JsonProperty("result")
    private Result result;
    /**
     * 由集成商定义的唯一转账代发识别ID
     * <p>
     * 更多信息：
     * <p>
     * 此字段为幂等字段
     * 字段最大长度：64
     */
    @JsonProperty("transferRequestId")
    private String transferRequestId;
    /**
     * 由万里汇定义的转账代发识别ID
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：64
     */
    @JsonProperty("transferId")
    private String transferId;

    /**
     * 支付方的转账代发请求细节
     */
    @JsonProperty("transferFromDetail")
    private TransferFromDetail transferFromDetail;
    /**
     * 收款方的转账代发请求细节，包括收款方所收到的转账金额等。
     */
    @JsonProperty("transferToDetail")
    private TransferToDetail transferToDetail;
    /**
     * 转账代发的更多信息，包括支付方和收款方的信息等。
     */
    @JsonProperty("transferOrderAddition")
    private TransferOrderAddition transferOrderAddition;
}
