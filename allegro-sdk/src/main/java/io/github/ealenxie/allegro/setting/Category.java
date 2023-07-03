package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 15:51
 * @version 1.0
 */
@Getter
@Setter
public class Category {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * definitions
     */
    @JsonProperty("definitions")
    private List<Definition> definitions;
}
