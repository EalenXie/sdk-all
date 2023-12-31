package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:54
 */
@Getter
@Setter
public class ParcelLabel {
    @JsonProperty("sender")
    private ParcelLabelSender sender;
    @JsonProperty("fileFormat")
    private String fileFormat;
    @JsonProperty("referenceNumber")
    private String referenceNumber;
}
