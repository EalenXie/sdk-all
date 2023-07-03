package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 16:33
 */
@Getter
@Setter
public class OfferAttachmentResponse {


    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * file
     */
    @JsonProperty("file")
    private CreateOfferFile file;
}
