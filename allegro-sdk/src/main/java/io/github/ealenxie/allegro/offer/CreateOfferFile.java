package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/3 16:34
 */
@NoArgsConstructor
@Data
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
