package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 18:13
 */
@Getter
@Setter
public class ProductListData {
    @JsonProperty("warehouseID")
    private String warehouseID;
    @JsonProperty("productCatalogName")
    private String productCatalogName;
}
