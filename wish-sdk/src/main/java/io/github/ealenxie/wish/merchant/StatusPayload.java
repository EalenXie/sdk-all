package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 10:00
 */
@Getter
@Setter
public class StatusPayload {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
