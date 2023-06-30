package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 16:17
 */
@NoArgsConstructor
@Data
public class PromoModifyTask {
    /**
     * offer
     */
    @JsonProperty("offer")
    private IdPayload offer;
    /**
     * marketplaceId
     */
    @JsonProperty("marketplaceId")
    private String marketplaceId;
    /**
     * scheduledAt
     */
    @JsonProperty("scheduledAt")
    private String scheduledAt;
    /**
     * finishedAt
     */
    @JsonProperty("finishedAt")
    private String finishedAt;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * errors
     */
    @JsonProperty("errors")
    private List<Errors> errors;
}
