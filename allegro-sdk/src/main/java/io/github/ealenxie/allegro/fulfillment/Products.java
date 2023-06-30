package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/6/30 17:49
 * @version 1.0
 */
@Getter
@Setter
public class Products {
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
     * gtins
     */
    @JsonProperty("gtins")
    private List<String> gtins;
    /**
     * image
     */
    @JsonProperty("image")
    private String image;
}
