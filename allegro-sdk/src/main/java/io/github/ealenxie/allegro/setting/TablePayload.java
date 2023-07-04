package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 10:03
 * @version 1.0
 */
@Getter
@Setter
public class TablePayload {

    /**
     * headers
     */
    @JsonProperty("headers")
    private List<Header> headers;
    /**
     * id
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * template
     */
    @JsonProperty("template")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private IdPayload template;
    /**
     * values
     */
    @JsonProperty("values")
    private List<Cell> values;
}
