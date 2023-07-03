package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 13:52
 * @version 1.0
 */
@Getter
@Setter
public class CreateAttachmentPayload {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
}
