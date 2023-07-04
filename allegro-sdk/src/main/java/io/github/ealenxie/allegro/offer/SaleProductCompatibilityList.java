package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:46
 */
@NoArgsConstructor
@Data
public class SaleProductCompatibilityList {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * items
     */
    @JsonProperty("items")
    private List<CompatibilityItem> items;
}
