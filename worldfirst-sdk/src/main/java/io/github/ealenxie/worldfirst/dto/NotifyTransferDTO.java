package io.github.ealenxie.worldfirst.dto;

import io.github.ealenxie.worldfirst.vo.Result;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/6 10:54
 */
@Getter
@Setter
public class NotifyTransferDTO {
    /**
     * 由集成商定义的唯一转账代发识别ID
     */
    private String transferRequestId;
    /**
     * 由万里汇定义的转账代发识别ID
     */
    private String transferId;
    /**
     * 代表转账代发结果
     */
    private Result transferResult;
    /**
     * 本次转账代发请求的结束时间。万里汇只在用户发送重复请求的时候返回此传参，以表明实际上的结束时间。
     * <p>
     * 更多信息：
     * <p>
     * 此字段采用ISO 8601 标准时间戳。如：2018-09-03T00:00:00+08:00，或2019-01-01T01:01:01Z（UTC时间）
     */
    private String transferFinishTime;
    /**
     * 支付方的转账代发请求细节
     */
    private TransferFromDetail transferFromDetail;
    /**
     * 收款方的转账代发请求细节，包括收款方所收到的转账金额等。
     */
    private TransferToDetail transferToDetail;
    /**
     * 转账代发的更多信息，包括支付方和收款方的信息等。
     */
    private TransferOrderAddition transferOrderAddition;
}
