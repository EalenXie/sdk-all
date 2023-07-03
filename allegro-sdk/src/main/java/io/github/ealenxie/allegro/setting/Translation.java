package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 16:30
 * @version 1.0
 */
@Getter
@Setter
public class Translation {
    /**
     * definition
     */
    @JsonProperty("definition")
    private IdPayload definition;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
}
