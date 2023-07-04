package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 10:32
 * @version 1.0
 */
@Getter
@Setter
public class OpenHours {
    /**
     * dayOfWeek
     */
    @JsonProperty("dayOfWeek")
    private String dayOfWeek;
    /**
     * from
     */
    @JsonProperty("from")
    private String from;
    /**
     * to
     */
    @JsonProperty("to")
    private String to;
}
