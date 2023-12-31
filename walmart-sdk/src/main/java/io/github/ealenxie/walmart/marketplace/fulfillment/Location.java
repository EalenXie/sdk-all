package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 14:40
 */
@Getter
@Setter
public class Location {
    /**
     * locationName
     */
    @JsonProperty("locationName")
    private String locationName;
    /**
     * address
     */
    @JsonProperty("address")
    private LocationAddress address;
    /**
     * locationId
     */
    @JsonProperty("locationId")
    private String locationId;
}
