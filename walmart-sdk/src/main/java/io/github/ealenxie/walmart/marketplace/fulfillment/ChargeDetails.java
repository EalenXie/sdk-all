package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 11:23
 */
@NoArgsConstructor
@Data
public class ChargeDetails {
    /**
     * chargeCategory
     */
    @JsonProperty("chargeCategory")
    private String chargeCategory;
    /**
     * chargeName
     */
    @JsonProperty("chargeName")
    private String chargeName;
    /**
     * chargePerUnit
     */
    @JsonProperty("chargePerUnit")
    private ChargePerUnit chargePerUnit;
    /**
     * taxDetails
     */
    @JsonProperty("taxDetails")
    private TaxDetails taxDetails;
}
