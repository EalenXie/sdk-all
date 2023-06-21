package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/27 17:11
 */
@Getter
@Setter
public class CarrierServiceResource {


    @JsonProperty("carrier_services")
    private List<CarrierService> carrierServices;
}
