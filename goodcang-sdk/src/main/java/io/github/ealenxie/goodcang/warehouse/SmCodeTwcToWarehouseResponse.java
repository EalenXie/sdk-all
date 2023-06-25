package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 17:50
 */
@Getter
@Setter
public class SmCodeTwcToWarehouseResponse {


    /**
     * 空运
     */
    @JsonProperty("AIR")
    private List<SmCodeTwcToWarehouse> air;
    /**
     * 海运散货
     */
    @JsonProperty("LCL")
    private List<SmCodeTwcToWarehouse> lcl;
    /**
     * 快递
     */
    @JsonProperty("EXPRESS")
    private List<SmCodeTwcToWarehouse> express;
}
