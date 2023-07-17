package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 11:07
 */
@Getter
@Setter
public class Suggestion {
    /**
     * zipcode
     */
    @JsonProperty("zipcode")
    private String zipcode;
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * street
     */
    @JsonProperty("street")
    private String street;
}
