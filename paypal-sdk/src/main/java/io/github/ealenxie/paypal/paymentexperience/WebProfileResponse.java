package io.github.ealenxie.paypal.paymentexperience;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/29 11:38
 */
@NoArgsConstructor
@Data
public class WebProfileResponse {

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
     * temporary
     */
    @JsonProperty("temporary")
    private Boolean temporary;
    /**
     * presentation
     */
    @JsonProperty("presentation")
    private Presentation presentation;
    /**
     * inputFields
     */
    @JsonProperty("input_fields")
    private InputFields inputFields;
    /**
     * flowConfig
     */
    @JsonProperty("flow_config")
    private FlowConfig flowConfig;
}
