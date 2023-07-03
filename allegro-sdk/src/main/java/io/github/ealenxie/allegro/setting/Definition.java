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
public class Definition {
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
     * description
     */
    @JsonProperty("description")
    private Description description;
    /**
     * maxPrice
     */
    @JsonProperty("maxPrice")
    private Price maxPrice;
    /**
     * availableConstraints
     */
    @JsonProperty("availableConstraints")
    private List<AvailableConstraint> availableConstraints;
    /**
     * updatedAt
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
}
