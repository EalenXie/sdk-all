package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/18 14:30
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ActionPayload {
    @JsonProperty("action")
    private String action;
}
