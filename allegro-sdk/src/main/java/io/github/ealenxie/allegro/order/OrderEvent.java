package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/24 14:48
 */
@Getter
@Setter
public class OrderEvent {

    @JsonProperty("events")
    private List<Event> events;
}
