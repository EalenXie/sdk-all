package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 10:03
 */
@Getter
@Setter
public class LogisticTicketType {
    /**
     * 类型名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 类型值
     */
    @JsonProperty("value")
    private Integer value;
}
