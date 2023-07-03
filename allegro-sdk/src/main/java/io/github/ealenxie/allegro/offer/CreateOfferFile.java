package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 16:34
 */
@Getter
@Setter
public class CreateOfferFile {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * url
     */
    @JsonProperty("url")
    private String url;
}
