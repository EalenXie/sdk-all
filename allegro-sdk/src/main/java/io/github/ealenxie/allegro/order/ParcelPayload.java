package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/3/27 10:54
 */
@Getter
@Setter
public class ParcelPayload {

    @JsonProperty("serviceId")
    private String serviceId;
    @JsonProperty("receiver")
    private PointAddress receiver;
    @JsonProperty("pickup")
    private PointAddress pickup;
    @JsonProperty("items")
    private List<ParcelItem> items;
    @JsonProperty("type")
    private String type;
    @JsonProperty("label")
    private ParcelLabel label;
    @JsonProperty("additionalServices")
    private AdditionalServicesPayload additionalServices;
}
