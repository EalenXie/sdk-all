package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.NamePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 16:32
 */
@Getter
@Setter
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
