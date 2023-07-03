package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 10:00
 * @version 1.0
 */
@Getter
@Setter
public class ParcelResponse {

    /**
     * orderId
     */
    @JsonProperty("orderId")
    private String orderId;
    /**
     * parcels
     */
    @JsonProperty("parcels")
    private List<Parcels> parcels;
}
