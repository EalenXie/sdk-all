package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/7 17:24
 * @version 1.0
 */
@Setter
@Getter
public class FeedIdPayload {

    /**
     * feedId
     */
    @JsonProperty("feedId")
    private String feedId;
}
