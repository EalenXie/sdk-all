package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 9:55
 */
@NoArgsConstructor
@Data
public class SelectionInsightProducts {
    /**
     * category
     */
    @JsonProperty("category")
    private IdPayload category;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * referenceId
     */
    @JsonProperty("referenceId")
    private String referenceId;
    /**
     * productIds
     */
    @JsonProperty("productIds")
    private List<String> productIds;
    /**
     * gtins
     */
    @JsonProperty("gtins")
    private List<String> gtins;
    /**
     * manufacturerCode
     */
    @JsonProperty("manufacturerCode")
    private String manufacturerCode;
    /**
     * brands
     */
    @JsonProperty("brands")
    private List<String> brands;
    /**
     * model
     */
    @JsonProperty("model")
    private String model;
}
