package io.github.ealenxie.paypal.paymentexperience;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/29 13:41
 */
@NoArgsConstructor
@Data
public class WebProfile {

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
     * flowConfig
     */
    @JsonProperty("flow_config")
    private FlowConfig flowConfig;
    /**
     * inputFields
     */
    @JsonProperty("input_fields")
    private InputFields inputFields;
    /**
     * presentation
     */
    @JsonProperty("presentation")
    private Presentation presentation;
}
