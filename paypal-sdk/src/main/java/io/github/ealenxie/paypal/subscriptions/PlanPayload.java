package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/18 15:46
 * @version 1.0
 */
@Getter
@Setter
public class PlanPayload {

    /**
     * plans
     */
    @JsonProperty("plans")
    private List<Plan> plans;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
