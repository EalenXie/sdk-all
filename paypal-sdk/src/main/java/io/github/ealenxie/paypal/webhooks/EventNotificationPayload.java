package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/20 14:41
 **/
@Getter
@Setter
public class EventNotificationPayload {
    /**
     * An array of webhook account IDs.
     */
    @JsonProperty("webhook_ids")
    private List<String> webhookIds;
}

