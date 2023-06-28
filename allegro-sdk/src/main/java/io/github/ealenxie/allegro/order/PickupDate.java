package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/4 9:13
 */
@Getter
@Setter
public class PickupDate {
    /**
     * string
     * Shipping date (format YYYY-MM-DD). Example: 2020-05-01
     */
    @JsonProperty("date")
    private String date;
    /**
     * string
     * Time box start hour. Example:
     */
    @JsonProperty("minTime")
    private String minTime;
    /**
     * string
     * Time box finish hour. Example: 14:00
     */
    @JsonProperty("maxTime")
    private String maxTime;
}
