package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author create by sch  2023/6/8 16:55
 * @version 1.0
 */
@Getter
@Setter
public class FeeVO {
    /**
     * ⾦额
     */
    @JsonProperty("feeAmount")
    private BigDecimal feeAmount;
    /**
     * 币种
     */
    @JsonProperty("feeCurrency")
    private String feeCurrency;
    /**
     * 费⽤类型：
     * BASE:平台服务费
     * EXTRA:⼩额服务费
     * FLOW_MORE:退税服务费
     * FULL_RCV:全额到账服务费
     * POBO:打款⼈名称服务费
     * SERVICE:业务服务费
     */
    @JsonProperty("feeType")
    private String feeType;
}
