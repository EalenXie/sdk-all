package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/18 15:14
 **/
@Getter
@Setter
public class WebhookQueryParam {

    /**
     * Default: "APPLICATION"
     * Filters the webhooks in the response by an anchor_id entity type.
     */
    @JsonProperty("anchor_type")
    private AnchorType anchorType;
}

