package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/3 12:47
 */
@Getter
@Setter
public class Attachment {
    @JsonProperty("fileName")
    private String fileName;
    @JsonProperty("url")
    private String url;
}
