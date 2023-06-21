package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutcomeDTO {
    @JsonProperty("network_status")
    private String networkStatus;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("risk_level")
    private String riskLevel;
    @JsonProperty("seller_message")
    private String sellerMessage;
    @JsonProperty("type")
    private String type;
}
