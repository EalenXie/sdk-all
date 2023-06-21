package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:56
 */
@Getter
@Setter
public class Label {
    @JsonProperty("sender")
    private Sender sender;
    @JsonProperty("fileFormat")
    private String fileFormat;
    @JsonProperty("referenceNumber")
    private String referenceNumber;
}
