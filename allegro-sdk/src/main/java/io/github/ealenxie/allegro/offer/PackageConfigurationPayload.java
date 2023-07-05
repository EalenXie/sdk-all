package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 16:17
 * @version 1.0
 */
@Getter
@Setter
public class PackageConfigurationPayload {

    /**
     * extensions
     */
    @JsonProperty("extensions")
    private List<Extensions> extensions;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * promotions
     */
    @JsonProperty("promotions")
    private List<Promotions> promotions;
    /**
     * publication
     */
    @JsonProperty("publication")
    private PublishPayload publication;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
