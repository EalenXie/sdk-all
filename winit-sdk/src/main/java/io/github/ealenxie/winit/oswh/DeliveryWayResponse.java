package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/15 14:04
 */
@Getter
@Setter
public class DeliveryWayResponse {


    /**
     * mainWinitProductCode
     */
    @JsonProperty("mainWinitProductCode")
    private String mainWinitProductCode;
    /**
     * deliveryID
     */
    @JsonProperty("deliveryID")
    private Integer deliveryID;
    /**
     * isMandoorplateNumbers
     */
    @JsonProperty("isMandoorplateNumbers")
    private String isMandoorplateNumbers;
    /**
     * warehouseID
     */
    @JsonProperty("warehouseID")
    private Integer warehouseID;
    /**
     * deliveryType
     */
    @JsonProperty("deliveryType")
    private String deliveryType;
    /**
     * deliveryWay
     */
    @JsonProperty("deliveryWay")
    private String deliveryWay;
    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * vASList
     */
    @JsonProperty("VASList")
    private List<VasList> vASList;
}
