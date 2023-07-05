package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Attachment {
    /**
     * fileName
     */
    @JsonProperty("fileName")
    private String fileName;
    /**
     * mimeType
     */
    @JsonProperty("mimeType")
    private String mimeType;
    /**
     * url
     */
    @JsonProperty("url")
    private String url;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
