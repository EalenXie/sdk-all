package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@Getter
@Setter
public class TecdocSpecification {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * items
     */
    @JsonProperty("items")
    private List<TecdocSpecificationItem> items;
}
