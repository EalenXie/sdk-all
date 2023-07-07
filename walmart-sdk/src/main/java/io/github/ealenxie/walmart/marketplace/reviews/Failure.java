package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 12:45
 */
@Getter
@Setter
public class Failure {
    /**
     * items
     */
    @JsonProperty("items")
    private List<FailureItem> items;
}
