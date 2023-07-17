package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 14:17
 */
@Getter
@Setter
public class DeclarationRuleListData {

    /**
     * endWarehouseCode
     */
    @JsonProperty("endWarehouseCode")
    private String endWarehouseCode;
    /**
     * productCode
     */
    @JsonProperty("productCode")
    private String productCode;
}
