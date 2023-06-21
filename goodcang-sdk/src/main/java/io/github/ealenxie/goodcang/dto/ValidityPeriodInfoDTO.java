package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/14 10:34
 */
@Getter
@Setter
public class ValidityPeriodInfoDTO {
    @JsonProperty("expiration_enabled")
    private String expirationEnabled;
    @JsonProperty("shelf_life_days")
    private String shelfLifeDays;
    @JsonProperty("outbound_threshold")
    private String outboundThreshold;
    @JsonProperty("warning_days")
    private String warningDays;
    @JsonProperty("inbound_threshold")
    private String inboundThreshold;
}
