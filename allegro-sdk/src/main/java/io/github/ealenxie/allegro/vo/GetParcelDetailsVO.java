package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/3/28 9:43
 */
@Getter
@Setter
public class GetParcelDetailsVO {

    @JsonProperty("parcelId")
    private String parcelId;
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
    @JsonProperty("state")
    private String state;
}
