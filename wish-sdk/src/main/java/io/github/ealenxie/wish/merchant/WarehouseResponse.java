package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 9:57
 */
@NoArgsConstructor
@Data
public class WarehouseResponse {

    /**
     * shippingType
     */
    @JsonProperty("shipping_type")
    private String shippingType;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * address
     */
    @JsonProperty("address")
    private Address address;
    /**
     * destinationCountries
     */
    @JsonProperty("destination_countries")
    private List<String> destinationCountries;
}
