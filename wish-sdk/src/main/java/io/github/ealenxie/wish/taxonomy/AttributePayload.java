package io.github.ealenxie.wish.taxonomy;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 14:46
 * @version 1.0
 */
@Getter
@Setter
public class AttributePayload {
    /**
     * constraint
     */
    @JsonProperty("constraint")
    private Constraint constraint;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * acceptedValues
     */
    @JsonProperty("accepted_values")
    private List<String> acceptedValues;
}
