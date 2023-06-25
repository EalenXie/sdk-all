package io.github.ealenxie.goodcang.base;

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
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 仓库名称
     */
    @JsonProperty("warehouse_name")
    private String warehouseName;
    /**
     * 仓库所在国家/地区代码
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 物理仓对象数组
     */
    @JsonProperty("wp_list")
    private List<Wp> wpList;
}
