package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.TypePayload;
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
    private TypePayload application;
    /**
     * visibility
     */
    @JsonProperty("visibility")
    private Publication visibility;
    /**
     * publication
     */
    @JsonProperty("publication")
    private TypePayload publication;
    /**
     * regulationsLink
     */
    @JsonProperty("regulationsLink")
    private String regulationsLink;
}
