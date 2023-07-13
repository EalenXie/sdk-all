package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 10:00
 */
@NoArgsConstructor
@Data
public class StatusPayload {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
