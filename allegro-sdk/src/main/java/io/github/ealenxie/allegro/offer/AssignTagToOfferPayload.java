package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 11:41
 */
@NoArgsConstructor
@Data
public class AssignTagToOfferPayload {

    /**
     * tags
     */
    @JsonProperty("tags")
    private List<IdPayload> tags;
}
