package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Vendor {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * url
     */
    @JsonProperty("url")
    private String url;
}
