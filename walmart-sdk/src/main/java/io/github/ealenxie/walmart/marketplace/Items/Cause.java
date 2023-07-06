package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 16:23
 * @version 1.0
 */
@Getter
@Setter
public class Cause {
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * field
     */
    @JsonProperty("field")
    private String field;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;

}
