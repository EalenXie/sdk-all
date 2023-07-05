package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 9:40
 * @version 1.0
 */
@Getter
@Setter
public class BadgeCampaigns {
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
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * eligibility
     */
    @JsonProperty("eligibility")
    private Eligibility eligibility;
    /**
     * application
     */
    @JsonProperty("application")
    private Compatibility application;
    /**
     * visibility
     */
    @JsonProperty("visibility")
    private Visibility visibility;
    /**
     * publication
     */
    @JsonProperty("publication")
    private Compatibility publication;
    /**
     * regulationsLink
     */
    @JsonProperty("regulationsLink")
    private String regulationsLink;
}
