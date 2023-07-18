package io.github.ealenxie.paypal.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoreInfo {

    @JsonProperty("store_id")
    private String storeId;

    @JsonProperty("terminal_id")
    private String terminalId;
}
