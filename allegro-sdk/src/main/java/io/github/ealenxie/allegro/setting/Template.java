package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 10:19
 * @version 1.0
 */
@Getter
@Setter
public class Template {
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
     * image
     */
    @JsonProperty("image")
    private Image image;
    /**
     * headers
     */
    @JsonProperty("headers")
    private List<Header> headers;
    /**
     * values
     */
    @JsonProperty("values")
    private List<Cell> values;
}
