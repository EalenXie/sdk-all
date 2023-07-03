package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/3 16:29
 */
@NoArgsConstructor
@Data
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
