package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:31
 */
@Getter
@Setter
public class UnpublishedCountPayload {

    /**
     * unpublishedCount
     */
    @JsonProperty("unpublishedCount")
    private String unpublishedCount;
    /**
     * unpublishedValue
     */
    @JsonProperty("unpublishedValue")
    private String unpublishedValue;
    /**
     * unpublishedReasonCode
     */
    @JsonProperty("unpublishedReasonCode")
    private String unpublishedReasonCode;
}
