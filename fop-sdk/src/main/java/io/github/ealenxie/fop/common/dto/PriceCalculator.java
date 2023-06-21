package io.github.ealenxie.fop.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 0:02
 */
@Getter
@Setter
public class PriceCalculator {

    @JsonProperty("service_code")
    private String serviceCode;
    @JsonProperty("billing_time")
    private String billingTime;
    @JsonProperty("product_codes")
    private List<String> productCodes;
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("length")
    private String length;
    @JsonProperty("width")
    private String width;
    @JsonProperty("height")
    private String height;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("cargo_units")
    private List<CargoUnit> cargoUnits;
    @JsonProperty("destination")
    private Destination destination;
}
