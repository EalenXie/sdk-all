package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 11:05
 */
@NoArgsConstructor
@Data
public class AreasEntity {
    /**
     * states
     */
    @JsonProperty("states")
    private List<AreasState> states;
    /**
     * regionCode
     */
    @JsonProperty("regionCode")
    private String regionCode;
    /**
     * regionName
     */
    @JsonProperty("regionName")
    private String regionName;
}
