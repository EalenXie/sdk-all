package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 13:38
 */
@NoArgsConstructor
@Data
public class ListElement<T> {
    /**
     * meta
     */
    @JsonProperty("meta")
    private Meta meta;
    /**
     * elements
     */
    @JsonProperty("elements")
    private T elements;
}
