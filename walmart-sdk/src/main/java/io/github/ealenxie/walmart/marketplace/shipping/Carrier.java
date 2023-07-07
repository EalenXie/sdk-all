package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 11:05
 */
@NoArgsConstructor
@Data
public class Carrier {
    /**
     * carrierId
     */
    @JsonProperty("carrierId")
    private String carrierId;
    /**
     * shortName
     */
    @JsonProperty("shortName")
    private String shortName;
    /**
     * carrierName
     */
    @JsonProperty("carrierName")
    private String carrierName;
}
