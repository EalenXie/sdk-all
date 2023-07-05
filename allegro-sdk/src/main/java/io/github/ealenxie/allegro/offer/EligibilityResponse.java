package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.StatusPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 9:29
 * @version 1.0
 */

@Getter
@Setter
public class EligibilityResponse {

    /**
     * consent
     */
    @JsonProperty("consent")
    private String consent;
    /**
     * qualification
     */
    @JsonProperty("qualification")
    private StatusPayload qualification;
}
