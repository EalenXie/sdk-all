package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/6/30 17:29
 * @version 1.0
 */
@Getter
@Setter
public class AdvanceShipNoticeReceivingResponse {

    /**
     * updatedAt
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
    /**
     * stage
     */
    @JsonProperty("stage")
    private String stage;
    /**
     * displayNumber
     */
    @JsonProperty("displayNumber")
    private String displayNumber;
    /**
     * content
     */
    @JsonProperty("content")
    private List<Content> content;
}
