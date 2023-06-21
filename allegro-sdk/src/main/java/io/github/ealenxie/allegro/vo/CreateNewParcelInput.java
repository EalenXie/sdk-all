package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/27 10:56
 */
@Getter
@Setter
public class CreateNewParcelInput {
    @JsonProperty("serviceId")
    private String serviceId;
    @JsonProperty("receiver")
    private Receiver receiver;
    @JsonProperty("pickup")
    private Pickup pickup;
    @JsonProperty("items")
    private List<Items> items;
    @JsonProperty("type")
    private String type;
    @JsonProperty("label")
    private Label label;
    @JsonProperty("additionalServices")
    private AdditionalService additionalServices;
}
