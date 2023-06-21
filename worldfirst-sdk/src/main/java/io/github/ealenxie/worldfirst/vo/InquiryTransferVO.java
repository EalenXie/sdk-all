package io.github.ealenxie.worldfirst.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.worldfirst.dto.TransferFromDetail;
import io.github.ealenxie.worldfirst.dto.TransferOrderAddition;
import io.github.ealenxie.worldfirst.dto.TransferToDetail;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/6 10:49
 */
@Getter
@Setter
public class InquiryTransferVO {
    @JsonProperty("result")
    private Result result;
    /**
     * 由集成商定义的唯一转账代发识别ID
     */
    @JsonProperty("transferRequestId")
    private String transferRequestId;
    /**
     * 由万里汇定义的转账代发识别ID
     */
    @JsonProperty("transferId")
    private String transferId;
    /**
     * 代表转账代发结果
     */
    @JsonProperty("transferResult")
    private Result transferResult;
    /**
     * 本次转账代发请求的结束时间。万里汇只在用户发送重复请求的时候返回此传参，以表明实际上的结束时间。
     * <p>
     * 更多信息：
     * <p>
     * 此字段采用ISO 8601 标准时间戳。如：2018-09-03T00:00:00+08:00，或2019-01-01T01:01:01Z（UTC时间）
     */
    @JsonProperty("transferFinishTime")
    private String transferFinishTime;
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
