package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 16:29
 */
@Getter
@Setter
public class UploadOfferImageResponse {

    /**
     * expiresAt
     */
    @JsonProperty("expiresAt")
    private String expiresAt;
    /**
     * location
     */
    @JsonProperty("location")
    private String location;
}
