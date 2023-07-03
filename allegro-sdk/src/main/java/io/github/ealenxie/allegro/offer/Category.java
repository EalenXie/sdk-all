package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 14:16
 */
@Getter
@Setter
public class Category {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * leaf
     */
    @JsonProperty("leaf")
    private Boolean leaf;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * options
     */
    @JsonProperty("options")
    private CategoryOptions options;
    /**
     * parent
     */
    @JsonProperty("parent")
    private IdPayload parent;
}
