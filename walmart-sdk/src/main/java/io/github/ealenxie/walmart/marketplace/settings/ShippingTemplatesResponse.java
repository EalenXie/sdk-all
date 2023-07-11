package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 13:55
 */
@Getter
@Setter
public class ShippingTemplatesResponse {


    /**
     * shippingTemplates
     */
    @JsonProperty("shippingTemplates")
    private List<ShippingTemplate> shippingTemplates;
    /**
     * totalRecords
     */
    @JsonProperty("totalRecords")
    private Integer totalRecords;
}
