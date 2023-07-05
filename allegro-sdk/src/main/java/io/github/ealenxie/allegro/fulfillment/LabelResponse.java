package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.StatusPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/30 17:13
 * @version 1.0
 */
@Getter
@Setter
public class LabelResponse {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * input
     */
    @JsonProperty("input")
    private AdvanceShipNoticeIdPayload input;
    /**
     * output
     */
    @JsonProperty("output")
    private StatusPayload output;
}
