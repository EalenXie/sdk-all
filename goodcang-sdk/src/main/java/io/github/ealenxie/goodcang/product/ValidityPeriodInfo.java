package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/14 10:34
 */
@Getter
@Setter
public class ValidityPeriodInfo {

    /**
     * 有效期批次信息
     */
    @JsonProperty("expiration_enabled")
    private Integer expirationEnabled;
    /**
     * 有效期天数
     */
    @JsonProperty("shelf_life_days")
    private Integer shelfLifeDays;
    /**
     * 禁售天数
     */
    @JsonProperty("outbound_threshold")
    private String outboundThreshold;
    /**
     * 预警天数
     */
    @JsonProperty("warning_days")
    private String warningDays;
    /**
     * 禁收天数
     */
    @JsonProperty("inbound_threshold")
    private String inboundThreshold;
}
