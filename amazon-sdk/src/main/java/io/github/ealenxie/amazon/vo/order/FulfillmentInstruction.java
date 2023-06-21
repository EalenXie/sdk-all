package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FulfillmentInstruction {
    @JsonProperty("FulfillmentSupplySourceId")
    private String fulfillmentSupplySourceId;
}