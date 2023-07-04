package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 15:17
 * @version 1.0
 */
@Getter
@Setter
public class Publication {
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
