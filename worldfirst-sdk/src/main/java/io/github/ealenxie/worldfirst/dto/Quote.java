package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/5 9:25
 */
@Getter
@Setter
public class Quote {
    /**
     * 唯一汇率标识ID
     * 字段最大长度：64
     */
    private String quoteId;
    /**
     * 汇率货币对，由2个符合ISO-4217格式的三字母货币代码组成
     * 字段最大长度：16
     */
    private String quoteCurrencyPair;
    /**
     * 汇率价格
     * 字段最大长度：20
     */
    private String quotePrice;
    /**
     * quotePrice有效的开始时间
     * 此字段采用ISO 8601 标准时间戳。如：2018-09-03T00:00:00+08:00，或2019-01-01T01:01:01Z（UTC时间）
     */
    private String quoteStartTime;
    /**
     * 汇率过期时间
     * 此字段采用ISO 8601 标准时间戳。如：2018-09-03T00:00:00+08:00，或2019-01-01T01:01:01Z（UTC时间）
     */
    private String quoteExpiryTime;
    /**
     * 汇率是否为保证汇率。
     */
    private Boolean guaranteed;
}
