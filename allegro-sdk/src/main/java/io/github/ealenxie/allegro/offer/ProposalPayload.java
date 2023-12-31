package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/4 11:07
 */
@Getter
@Setter
public class ProposalPayload {
    /**
     * current
     */
    @JsonProperty("current")
    private String current;
    /**
     * proposal
     */
    @JsonProperty("proposal")
    private String proposal;
    /**
     * reason
     */
    @JsonProperty("reason")
    private String reason;
    /**
     * resolutionType
     */
    @JsonProperty("resolutionType")
    private String resolutionType;
}
