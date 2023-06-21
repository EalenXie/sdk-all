package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutomatedShippingSettings {
    @JsonProperty("HasAutomatedShippingSettings")
    private Boolean hasAutomatedShippingSettings;
    @JsonProperty("AutomatedCarrier")
    private String automatedCarrier;
    @JsonProperty("AutomatedShipMethod")
    private String automatedShipMethod;
}