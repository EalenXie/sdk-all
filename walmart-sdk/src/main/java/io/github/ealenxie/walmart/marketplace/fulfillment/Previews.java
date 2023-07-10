package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 14:26
 */
@NoArgsConstructor
@Data
public class Previews {
    /**
     * previewType
     */
    @JsonProperty("previewType")
    private String previewType;
    /**
     * preview
     */
    @JsonProperty("preview")
    private List<InboundPreview> preview;
}
