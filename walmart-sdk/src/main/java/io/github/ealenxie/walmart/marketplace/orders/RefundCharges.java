package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/10 12:44
 */
@Getter
@Setter
public class RefundCharges {
    @JsonProperty("refundCharge")
    private List<RefundCharge> refundCharge;
}
