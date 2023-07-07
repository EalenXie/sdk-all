package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 13:38
 */
@Getter
@Setter
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
