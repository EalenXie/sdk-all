package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@NoArgsConstructor
@Data
public class Trend {
    /**
     * statsType
     */
    @JsonProperty("statsType")
    private String statsType;
    /**
     * values
     */
    @JsonProperty("values")
    private List<MoneyValue> values;
}
