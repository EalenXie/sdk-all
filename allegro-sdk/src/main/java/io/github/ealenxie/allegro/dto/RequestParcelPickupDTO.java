package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/4/4 9:13
 */
@Getter
@Setter
public class RequestParcelPickupDTO {
    /**
     * Array of strings
     * Ids of parcels.
     */
    @JsonProperty("parcelIds")
    private List<String> parcelIds;
    @JsonProperty("pickupDate")
    private PickupDate pickupDate;
}
