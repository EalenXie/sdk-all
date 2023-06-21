package io.github.ealenxie.worldfirst.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.worldfirst.vo.Result;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/5 9:29
 */
@Getter
@Setter
public class TransferToDetail {
    /**
     * 收款明细请求ID
     */
    private String transferToRequestId;
    /**
     * 收款人收款所使用的转账代发方法.
     */
    @JsonProperty("transferToMethod")
    private PaymentMethod transferToMethod;
    /**
     * 转账收款金额（计算费用前）
     * 更多信息：
     * 在createPayout 接口下，此字段下只有currency字段，无value字段。
     * 如果请求体中 transferFromDetail.transferFromAmount 赋值为 null，则此字段的赋值也为 null。
     */
    @JsonProperty("transferToAmount")
    private Amount transferToAmount;
    /**
     * 转账收款币种，和金额(transferToAmount)不能同时指定。
     * 符合ISO-4217规范的三字母货币代码
     */
    private String transferToCurrency;

    /**
     * （注意: 仅response响应体有此字段）
     * 转账收款金额（计算费用后），响应阶段返回
     */
    @JsonProperty("actualTransferToAmount")
    private Amount actualTransferToAmount;
    /**
     * 转账收款金额（计算费用后），响应阶段返回
     */
    @JsonProperty("feeAmount")
    private Amount feeAmount;
    /**
     * 收费金额类型。
     * 可取值：
     * OUR
     * BEN
     * SHA
     */
    private String feeMode;
    /**
     * 转账汇率
     */
    @JsonProperty("transferQuote")
    private Quote transferQuote;
    /**
     * 由集成商上传的转账通知地址，万里汇会使用此地址将转账结果发送给集成商
     */
    private String transferNotifyUrl;
    /**
     * （注意: 仅response响应体有此字段）
     * AAC返回的转账收款唯一id，可以用查询，响应阶段返回
     * 更多信息：
     * 字段最大长度：64
     */
    private String transferToId;
    /**
     * 本次AAC处理收款的结果, 反应本次收款的业务状态、错误信息等，响应阶段且批量转账时返回
     */
    @JsonProperty("transferToResult")
    private Result transferToResult;
    /**
     * （注意: 仅response响应体有此字段）
     * 转账收款完成时间
     * 更多信息：
     * 此字段采用ISO 8601 标准时间戳。如：2018-09-03T00:00:00+08:00，或2019-01-01T01:01:01Z（UTC时间）
     */
    private String transferToFinishTime;
    /**
     * 用于银行结算账单使用的信息。
     * 更多信息：
     * 字段最大长度：1024
     */
    private String transferToRemark;
    /**
     * 用于用户展示的简短附言
     * 更多信息：
     * 字段最大长度：256
     */
    private String transferMemo;
    /**
     * 额外信息
     * 更多信息：
     * 字段最大长度：2048
     */
    private String extendInfo;
    /**
     * （注意: 仅response响应体有此字段）
     * 银行机构或收款代理方返回的金额（退票金额）。 通知阶段返回
     */
    @JsonProperty("transferToReturnAmount")
    private Amount transferToReturnAmount;
    /**
     * （注意: 仅response响应体有此字段）
     * 银行机构或收款代理方退票发生的时间。 通知阶段返回
     * 更多信息：
     * 此字段采用ISO 8601 标准时间戳。如：2018-09-03T00:00:00+08:00，或2019-01-01T01:01:01Z（UTC时间）
     */
    private String transferToReturnTime;
    /**
     * 适用于"转账到卡/payout"才有
     * 转账代发目的代码。若无法确定，联系万里汇技术支持以确定字段取值。
     * 可取值：
     * COM 支付佣金
     * TXS 缴税
     * GDS 商品买卖
     * ACM 支付代理佣金
     */
    private String purposeCode;
    /**
     * 适用于"转账到卡/payout"
     * 是否全额到账 (Full Value Transfer)，保证收款人收到足额的费用，可取值：
     * Y ：要求全额到账
     * N ：不要求全额到账
     */
    private String isFVT;
    /**
     * 适用于"转账到卡/payout"
     * 到账的偏好类型。可取值如下：
     * NEED_FVT：指需要使用全额到账（FVT）能力。
     * PREFER_FVY：指倾向于使用全额到账（FVT）能力。
     * 注：此字段所提供的FVT能力仍处于白名单开量阶段，尚未完全开放。如果需要使用该能力，请提前联系您的BD负责人或SA。
     */
    private String arrivalType;
    /**
     * 适用于"转账到卡/payout"
     * （注意: 仅response响应体有此字段）
     * 本次交易是否使用全额到账（FVT）能力。可取值如下：
     * true：本次交易使用了FVT能力。
     * false：本次交易未使用FVT能力。
     * 注：此字段仅在您具备FVT能力时返回。目前，FVT能力仍处于白名单开量阶段，尚未完全开放。如果需要使用该能力，请提前联系您的BD负责人或SA。
     */
    private String fvtPayment;

}
