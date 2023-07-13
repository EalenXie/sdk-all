package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 16:27
 */
@NoArgsConstructor
@Data
public class Video {
    /**
     * url
     */
    @JsonProperty("url")
    private String url;
}
