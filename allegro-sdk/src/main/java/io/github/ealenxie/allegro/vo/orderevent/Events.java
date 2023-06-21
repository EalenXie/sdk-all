package io.github.ealenxie.allegro.vo.orderevent;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:08
 */
@Getter
@Setter
public class Events {
    @JsonProperty("id")
    private String id;
    @JsonProperty("order")
    private Order order;
    @JsonProperty("type")
    private String type;
    @JsonProperty("occurredAt")
    private String occurredAt;
}
