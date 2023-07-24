package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 10:32
 */
@Getter
@Setter
public class DateRange {
    /**
     * start
     */
    @JsonProperty("start")
    private String start;
    /**
     * end
     */
    @JsonProperty("end")
    private String end;
}
