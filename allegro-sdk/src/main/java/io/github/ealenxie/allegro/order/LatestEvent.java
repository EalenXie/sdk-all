package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LatestEvent {
    /**
     * 事件编号
     */
    @JsonProperty("id")
    private String id;
    /**
     * 事件发送时间
     */
    @JsonProperty("occurredAt")
    private String occurredAt;
}