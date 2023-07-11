package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 13:55
 */
@NoArgsConstructor
@Data
public class ShippingTemplate {
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
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * rateModelType
     */
    @JsonProperty("rateModelType")
    private String rateModelType;
    /**
     * createdDate
     */
    @JsonProperty("createdDate")
    private Long createdDate;
    /**
     * modifiedDate
     */
    @JsonProperty("modifiedDate")
    private Long modifiedDate;


}
