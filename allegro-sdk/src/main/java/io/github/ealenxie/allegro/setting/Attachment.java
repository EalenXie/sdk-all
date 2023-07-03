package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 13:31
 * @version 1.0
 */
@Getter
@Setter
public class Attachment {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * url
     */
    @JsonProperty("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String url;
}
