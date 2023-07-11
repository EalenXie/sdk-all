package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 10:02
 */
@Getter
@Setter
public class IdPayload {
    @JsonProperty("id")
    private String id;
}
