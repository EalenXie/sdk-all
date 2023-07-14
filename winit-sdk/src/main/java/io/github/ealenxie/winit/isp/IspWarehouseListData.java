package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 18:03
 */
@Getter
@Setter
public class IspWarehouseListData {
    /**
     * productCode
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * productCatalogName
     */
    @JsonProperty("productCatalogName")
    private String productCatalogName;
}
