package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 16:43
 */
@Getter
@Setter
public class PublishPayload {
    /**
     * duration
     */
    @JsonProperty("duration")
    private String duration;
    /**
     * endingAt
     */
    @JsonProperty("endingAt")
    private String endingAt;
    /**
     * marketplaces
     */
    @JsonProperty("marketplaces")
    private Marketplaces marketplaces;
    /**
     * startingAt
     */
    @JsonProperty("startingAt")
    private String startingAt;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * endedBy
     */
    @JsonProperty("endedBy")
    private String endedBy;
    /**
     * republish
     */
    @JsonProperty("republish")
    private Boolean republish;


}
