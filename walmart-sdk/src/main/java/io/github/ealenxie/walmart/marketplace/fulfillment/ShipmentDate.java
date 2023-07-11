package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 15:10
 */
@Getter
@Setter
public class ShipmentDate {
    /**
     * actualDate
     */
    @JsonProperty("actualDate")
    private String actualDate;
    /**
     * dateTypeId
     */
    @JsonProperty("dateTypeId")
    private String dateTypeId;
    /**
     * expectedDate
     */
    @JsonProperty("expectedDate")
    private String expectedDate;
}
