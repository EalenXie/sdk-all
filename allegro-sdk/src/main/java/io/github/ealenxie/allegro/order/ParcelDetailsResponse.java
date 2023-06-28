package io.github.ealenxie.allegro.order;

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
public class ParcelDetailsResponse {

    @JsonProperty("parcelId")
    private String parcelId;
    @JsonProperty("serviceId")
    private String serviceId;
    @JsonProperty("receiver")
    private PointAddress receiver;
    @JsonProperty("pickup")
    private PointAddress pickup;
    @JsonProperty("items")
    private List<ParcelWayBillItem> items;
    @JsonProperty("type")
    private String type;
    @JsonProperty("label")
    private ParcelLabel label;
    @JsonProperty("additionalServices")
    private AdditionalServices additionalServices;
    @JsonProperty("state")
    private String state;
}
