package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class FulfillmentRecords {
    @JsonProperty("event_type")
    private String eventType;
    @JsonProperty("event_time")
    private String eventTime;
}
