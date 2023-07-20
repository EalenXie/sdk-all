package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/18 13:52
 */
@Getter
@Setter
public class DisputesResponse {


    /**
     * items
     */
    @JsonProperty("items")
    private List<DisputeItem> items;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
