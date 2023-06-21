package io.github.ealenxie.worldfirst.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/5 14:26
 */
@Getter
@Setter
public class InquiryStatementListQuote {
    /**
     * 代表转账基础货币的三字母ISO-4217代码。如：USD。
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：3
     */
    @JsonProperty("transferFromCurrency")
    private String transferFromCurrency;
    /**
     * 代表兑换货币的三字母ISO-4217代码。如：USD。
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：3
     */
    @JsonProperty("transferToCurrency")
    private String transferToCurrency;
    /**
     * 汇率价格。如：quotaPrice为7，且quoteUnit为1，汇率对为USD/CNY，购买1USD需7CNY。
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：20
     */
    private String quotePrice;
}
