package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 10:01
 */
@Getter
@Setter
public class WarehousePayload {

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
