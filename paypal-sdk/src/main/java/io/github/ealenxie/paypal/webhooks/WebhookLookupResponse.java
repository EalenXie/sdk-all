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
public class WebhookLookupResponse {


    /**
     * The ID of the webhook lookup.
     */
    @JsonProperty("id")
    private String id;
    /**
     * The application client ID.
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * An array of request-related HATEOAS links.
     */
    @JsonProperty("links")
    private List<Link> links;

}

