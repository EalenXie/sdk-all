package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 16:50
 */
@Getter
@Setter
public class CollectWarehouse {
    /**
     * 仓库id
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
    /**
     * 仓库编码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 仓库名称
     */
    @JsonProperty("warehouse_name")
    private String warehouseName;
    /**
     * 国家名称
     */
    @JsonProperty("country_name")
    private String countryName;
    /**
     * 国家编码
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 省/州
     */
    @JsonProperty("state")
    private String state;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 街道地址1
     */
    @JsonProperty("street_address1")
    private String streetAddress1;
    /**
     * 街道地址2
     */
    @JsonProperty("street_address2")
    private String streetAddress2;
    /**
     * 邮编
     */
    @JsonProperty("postcode")
    private String postcode;
    /**
     * 物理仓编码
     */
    @JsonProperty("wp_code")
    private String wpCode;
}
