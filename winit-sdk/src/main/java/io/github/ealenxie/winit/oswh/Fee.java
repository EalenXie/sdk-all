package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

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
    private Double feeNumber;
    /**
     * 币种
     */
    @JsonProperty("ISOCode")
    private String iSOCode;
    /**
     * 返利
     */
    @JsonProperty("rebate")
    private Double rebate;
    /**
     * 折扣
     */
    @JsonProperty("discount")
    private Double discount;
    /**
     * 应收
     */
    @JsonProperty("paid-up")
    private Double paidup;
}
