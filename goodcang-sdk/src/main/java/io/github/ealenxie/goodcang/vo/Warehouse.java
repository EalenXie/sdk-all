package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/9 11:36
 */
@Getter
@Setter
public class Warehouse {
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("warehouse_name")
    private String warehouseName;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("wp_list")
    private List<Wp> wpList;
}
