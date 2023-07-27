package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/27 9:16
 * @version 1.0
 */
@Getter
@Setter
public class TransferMethod {
    /**
     * transferMethodType
     */
    @JsonProperty("transfer_method_type")
    private String transferMethodType;
    /**
     * currencies
     */
    @JsonProperty("currencies")
    private List<String> currencies;
}
