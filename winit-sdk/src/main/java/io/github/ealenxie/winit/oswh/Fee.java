package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author create by sch  2023/4/20 16:49
 * @version 1.0
 */
@Getter
@Setter
public class Fee {
    /**
     * 费用项名称
     */
    @JsonProperty("feeName")
    private String feeName;
    /**
     * 费用项编码
     */
    @JsonProperty("feeCode")
    private String feeCode;
    /**
     * 总费用
     */
    @JsonProperty("feeNumber")
    private BigDecimal feeNumber;
    /**
     * 币种
     */
    @JsonProperty("ISOCode")
    private String iSOCode;
    /**
     * 返利
     */
    @JsonProperty("rebate")
    private BigDecimal rebate;
    /**
     * 折扣
     */
    @JsonProperty("discount")
    private BigDecimal discount;
    /**
     * 应收
     */
    @JsonProperty("paid-up")
    private BigDecimal paidup;
}
