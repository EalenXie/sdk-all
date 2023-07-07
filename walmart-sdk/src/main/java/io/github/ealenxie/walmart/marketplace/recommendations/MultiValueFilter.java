package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 11:23
 */
@NoArgsConstructor
@Data
public class MultiValueFilter {
    /**
     * parameter
     */
    @JsonProperty("parameter")
    private String parameter;
    /**
     * values
     */
    @JsonProperty("values")
    private List<String> values;
}
