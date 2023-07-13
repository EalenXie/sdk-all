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
public class AttributeResponse {

    /**
     * attributes
     */
    @JsonProperty("attributes")
    private List<AttributePayload> attributes;
}
