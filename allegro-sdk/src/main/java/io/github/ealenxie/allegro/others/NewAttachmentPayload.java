package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class NewAttachmentPayload {
    /**
     * filename
     */
    @JsonProperty("filename")
    private String filename;

    /**
     * size
     */
    @JsonProperty("size")
    private Integer size;
}
