package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 16:28
 */
@NoArgsConstructor
@Data
public class EventOffer {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * external
     */
    @JsonProperty("external")
    private IdPayload external;
}
