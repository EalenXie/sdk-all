package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 13:18
 */
@NoArgsConstructor
@Data
public class CompatibleProduct {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * text
     */
    @JsonProperty("text")
    private String text;
    /**
     * group
     */
    @JsonProperty("group")
    private IdPayload group;
    /**
     * attributes
     */
    @JsonProperty("attributes")
    private List<Attributes> attributes;
}
