package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


/**
 * @author lanzhi
 * Created on 2023/7/19 16:33
 **/
@Getter
@Setter
public class WebhookLookupsResponse {

    /**
     * An array of webhook lookups.
     */
    @JsonProperty("webhook_lookups")
    private List<WebhookLookupResponse> webhookLookups;

}

