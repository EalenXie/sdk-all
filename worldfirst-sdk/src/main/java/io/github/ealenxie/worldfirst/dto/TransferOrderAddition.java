package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/5 15:06
 */
@Getter
@Setter
public class TransferOrderAddition {
    /**
     * 商户端的订单ID，用于用户消费记录展示，支付后续操作如客诉、争议等追踪使用。
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：64
     */
    private String referenceOrderId;
    /**
     * 转账环境
     */
    private Env env;
    /**
     * 付款人附加信息
     */
    private TransferFromAddition transferFromAddition;
    /**
     * 收款人附加信息列表
     */
    private List<TransferToAddition> transferToAddition;
    /**
     * 额外的信息。
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：2048
     */
    private String extendInfo;
}
