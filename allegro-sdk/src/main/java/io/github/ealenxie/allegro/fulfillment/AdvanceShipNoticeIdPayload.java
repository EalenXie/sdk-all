package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/30 16:45
 * @version 1.0
 */
@Getter
@Setter
public class AdvanceShipNoticeIdPayload {
    /**
     * advanceShipNoticeId
     */
    @JsonProperty("advanceShipNoticeId")
    private String advanceShipNoticeId;
}
