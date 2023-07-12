package io.github.ealenxie.wish.bulkproducts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/12 13:17
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
