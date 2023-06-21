package io.github.ealenxie.allegro.vo.checkoutform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class Guaranteed {
    /**
     * 最早交付
     */
    @JsonProperty("from")
    private String from;
    /**
     * 最近交付
     */
    @JsonProperty("to")
    private String to;
}
