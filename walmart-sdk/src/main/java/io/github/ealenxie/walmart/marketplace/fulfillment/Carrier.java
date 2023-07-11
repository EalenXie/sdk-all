package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 14:40
 */
@Getter
@Setter
public class Carrier {
    /**
     * carrierId
     */
    @JsonProperty("carrierId")
    private String carrierId;
    /**
     * carrierName
     */
    @JsonProperty("carrierName")
    private String carrierName;
}
