package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/6 14:30
 */
@Getter
@Setter
public class ItemsPayload<T> {
    @JsonProperty("items")
    private List<T> items;

}
