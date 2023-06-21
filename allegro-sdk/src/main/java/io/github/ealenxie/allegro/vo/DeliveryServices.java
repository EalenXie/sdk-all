package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:50
 */
@Getter
@Setter
public class DeliveryServices {
    @JsonProperty("id")
    private String id;
    @JsonProperty("service")
    private String service;
    @JsonProperty("name")
    private String name;
    @JsonProperty("carrierId")
    private String carrierId;
    @JsonProperty("additionalServices")
    private AdditionalService additionalServices;
    @JsonProperty("owner")
    private String owner;
}
