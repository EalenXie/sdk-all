package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 14:25
 * @version 1.0
 */
@Getter
@Setter
public class ShippingRatePayload {

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
     * rates
     */
    @JsonProperty("rates")
    private List<Rates> rates;
    /**
     * lastModified
     */
    @JsonProperty("lastModified")
    private String lastModified;
}
