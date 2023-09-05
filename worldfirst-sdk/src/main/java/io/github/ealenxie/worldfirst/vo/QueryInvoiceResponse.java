package io.github.ealenxie.worldfirst.vo;

import io.github.ealenxie.worldfirst.dto.Amount;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/8/4 10:23
 **/
@NoArgsConstructor
@Data
@Getter
@Setter
public class QueryInvoiceResponse {

    /**
     * 由万里汇定义的业务单 ID。
     * <p>
     * 字段最大长度：32
     */
    private String bizOrderId;
    /**
     * 单据状态。可取值如下：
     * <p>
     * INIT：指用户在收银台未发起支付。
     * PROCESSING：指用户在收银台提交支付且支付申请受理成功。
     * FAILED：指单渠道返回失败。
     * SUCCESSFUL：指渠道返回成功，但后续可能会出现退票场景。
     * RETURNED：指渠道返回退票。
     */
    private String invoiceStatus;
    /**
     * 支付金额，即集成商所创建账单的应付金额。
     */
    private Amount payToAmount;
    /**
     * 由集成商定义的唯一请求 ID。
     * <p>
     * 字段最大长度：32
     */
    private String requestId;
    /**
     * API 调用结果，即集成商是否成功接收通知。
     */
    private Result result;
}

