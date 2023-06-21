package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/27 10:54
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
