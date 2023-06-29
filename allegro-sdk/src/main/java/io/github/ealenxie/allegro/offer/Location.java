package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@NoArgsConstructor
@Data
public class Location {
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * countryCode
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * postCode
     */
    @JsonProperty("postCode")
    private String postCode;
    /**
     * province
     */
    @JsonProperty("province")
    private String province;
}
