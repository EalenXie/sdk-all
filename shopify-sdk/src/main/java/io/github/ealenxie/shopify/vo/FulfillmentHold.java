package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/27 17:03
 */
@Getter
@Setter
public class FulfillmentHold {

    @JsonProperty("reason")
    private String reason;
    @JsonProperty("reason_notes")
    private String reasonNotes;
}
