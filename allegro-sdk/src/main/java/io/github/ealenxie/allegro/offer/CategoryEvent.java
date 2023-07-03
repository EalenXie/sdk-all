package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 15:44
 */
@Getter
@Setter
public class CategoryEvent {


    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * occurredAt
     */
    @JsonProperty("occurredAt")
    private String occurredAt;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * category
     */
    @JsonProperty("category")
    private Category category;
}
