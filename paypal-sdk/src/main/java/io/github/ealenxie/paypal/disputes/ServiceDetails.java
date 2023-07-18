package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@NoArgsConstructor
@Data
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
