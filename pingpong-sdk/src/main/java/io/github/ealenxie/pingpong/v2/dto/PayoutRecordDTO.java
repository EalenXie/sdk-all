package io.github.ealenxie.pingpong.v2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/8 17:18
 * @version 1.0
 */
@Getter
@Setter
public class PayoutRecordDTO extends PageDTO {
    /**
     * 客户ID
     */
    @JsonProperty("clientId")
    private String clientId;
    /**
     * 付款类型：
     * SUPPLIER_PAY:供应商付款
     * VAT_PAY： VAT缴税
     * FLOW_MORE:退税服务
     * HEDGINGX_PAY:HedgingX
     * FX_PAY:福鑫充值
     * VAT_FILING:VAT报税
     * VAT_REGISTER:VAT注册
     * AMAZON_ADDED_SERVICE:亚⻢逊增值服务
     * CERTIFICATION_SERVICE_PROVIDER:认证服务商
     * VCC_RECHARGE:增值服务(VCC充值)
     * ADS_PAY:⼴告服务:
     */
    @JsonProperty("payoutType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String payoutType;
    /**
     * 币种
     */
    @JsonProperty("applyCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String applyCurrency;
    /**
     * 收款⽅账号
     */
    @JsonProperty("receiverAccount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverAccount;
    /**
     * 状态：
     * WAIT_PAY:待⽀付
     * PENDING:处理中
     * SUCCESS:付款成功
     * FAILED:付款失败
     * CLOSED:超时订单关闭
     * REFUND_TICKET:已退票
     * REFUND:已退款
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    /**
     * 开始时间unix时间戳（秒）
     */
    @JsonProperty("startTime")
    private String startTime;
    /**
     * 结束时间 unix时间戳（秒），endTime-startTime<=2592000(30天)
     */
    @JsonProperty("endTime")
    private String endTime;

}
