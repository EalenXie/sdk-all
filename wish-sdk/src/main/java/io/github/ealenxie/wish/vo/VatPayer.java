package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class VatPayer {
    @JsonProperty("ioss_number")
    private String iossNumber;
    @JsonProperty("tax_number")
    private String taxNumber;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private ShippingDetail address;
}
