package io.github.ealenxie.walmart.marketplace.notifications;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 16:49
 */
@Getter
@Setter
public class AllSubscriptionsQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String subscriptionId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String eventType;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String resourceName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
}
