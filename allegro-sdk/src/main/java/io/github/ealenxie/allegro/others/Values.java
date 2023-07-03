package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Values {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * value
     */
    @JsonProperty("value")
    private String value;
    /**
     * idSuffix
     */
    @JsonProperty("idSuffix")
    private String idSuffix;
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * selected
     */
    @JsonProperty("selected")
    private Boolean selected;
}
