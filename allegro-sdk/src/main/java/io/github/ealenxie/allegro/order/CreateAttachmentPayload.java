package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 12:19
 */
@Getter
@Setter
public class CreateAttachmentPayload {
    /**
     * fileName
     */
    @JsonProperty("fileName")
    private String fileName;
    /**
     * size
     */
    @JsonProperty("size")
    private Integer size;
}
