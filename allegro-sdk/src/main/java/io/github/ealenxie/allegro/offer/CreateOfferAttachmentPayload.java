package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.NamePayload;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/3 16:32
 */
@NoArgsConstructor
@Data
public class CreateOfferAttachmentPayload {


    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * file
     */
    @JsonProperty("file")
    private NamePayload file;
}
