package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@Getter
@Setter
public class ServiceDetails {
    /**
     * subReasons
     */
    @JsonProperty("sub_reasons")
    private List<String> subReasons;
    /**
     * purchaseUrl
     */
    @JsonProperty("purchase_url")
    private String purchaseUrl;
}
