package io.github.ealenxie.walmart.marketplace.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 16:46
 */
@Getter
@Setter
public class Headers {
    /**
     * contenttype
     */
    @JsonProperty("content-type")
    private String contenttype;
}
