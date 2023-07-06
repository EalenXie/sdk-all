package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 16:28
 * @version 1.0
 */
@Getter
@Setter
public class AttributePayload {
    /**
     * nameValueAttribute
     */
    @JsonProperty("nameValueAttribute")
    private List<Attribute> nameValueAttribute;
}
