package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 14:34
 */
@Getter
@Setter
public class LogisticsPlanGetData {

    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * inspectionWarehouseCode
     */
    @JsonProperty("inspectionWarehouseCode")
    private String inspectionWarehouseCode;
    /**
     * destinationWarehouseCode
     */
    @JsonProperty("destinationWarehouseCode")
    private String destinationWarehouseCode;
}
