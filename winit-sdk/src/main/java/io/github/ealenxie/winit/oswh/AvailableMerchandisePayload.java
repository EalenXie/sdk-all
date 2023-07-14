package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 17:16
 * @version 1.0
 */
@Getter
@Setter
public class AvailableMerchandisePayload {

    /**
     * customerCode
     */
    @JsonProperty("customerCode")
    private String customerCode;
    /**
     * firstLegType
     */
    @JsonProperty("firstLegType")
    private String firstLegType;
    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * destinationWarehouseCode
     */
    @JsonProperty("destinationWarehouseCode")
    private String destinationWarehouseCode;
}
