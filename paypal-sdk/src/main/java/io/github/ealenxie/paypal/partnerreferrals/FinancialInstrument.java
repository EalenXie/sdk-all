package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/27 9:04
 * @version 1.0
 */
@Getter
@Setter
public class FinancialInstrument {
    /**
     * banks
     */
    @JsonProperty("banks")
    private List<BankPayload> banks;
}
