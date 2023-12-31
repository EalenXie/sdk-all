package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:54
 */
@Getter
@Setter
public class PointAddress {
    @JsonProperty("address")
    private Address address;
    @JsonProperty("email")
    private String email;
    @JsonProperty("name")
    private String name;
    @JsonProperty("company")
    private String company;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("pointId")
    private String pointId;
}
