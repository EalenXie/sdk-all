package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/18 15:22
 **/
@Getter
@Setter
public class WebhooksResponse {

    @JsonProperty("webhooks")
    private List<WebhookResponse> webhooks;
}

