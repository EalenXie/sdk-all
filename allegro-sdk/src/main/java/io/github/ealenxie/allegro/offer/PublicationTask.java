package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 10:05
 */
@Getter
@Setter
public class PublicationTask {
    /**
     * field
     */
    @JsonProperty("field")
    private String field;
    /**
     * finishedAt
     */
    @JsonProperty("finishedAt")
    private String finishedAt;
    /**
     * message
     */
    @JsonProperty("message")
    private String message;
    /**
     * offer
     */
    @JsonProperty("offer")
    private Offer offer;
    /**
     * scheduledAt
     */
    @JsonProperty("scheduledAt")
    private String scheduledAt;
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
