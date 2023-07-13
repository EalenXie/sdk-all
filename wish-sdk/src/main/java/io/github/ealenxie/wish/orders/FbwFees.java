package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class FbwFees {
    @JsonProperty("amount")
    private Money amount;
    @JsonProperty("fee_name")
    private String feeName;
    @JsonProperty("fee_type")
    private String feeType;
}
