package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 17:14
 */
@Getter
@Setter
public class IspOrderPackage {
    /**
     * declaredTotalValue
     */
    @JsonProperty("declaredTotalValue")
    private BigDecimal declaredTotalValue;
    /**
     * merchandiseList
     */
    @JsonProperty("merchandiseList")
    private List<IspOrderMerchandise> merchandiseList;
    /**
     * trackingNo
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * length
     */
    @JsonProperty("length")
    private Integer length;
    /**
     * width
     */
    @JsonProperty("width")
    private BigDecimal width;
    /**
     * weight
     */
    @JsonProperty("weight")
    private BigDecimal weight;
    /**
     * widthActual
     */
    @JsonProperty("widthActual")
    private Integer widthActual;
    /**
     * heightActual
     */
    @JsonProperty("heightActual")
    private Integer heightActual;
    /**
     * lengthActual
     */
    @JsonProperty("lengthActual")
    private Integer lengthActual;
    /**
     * weightActual
     */
    @JsonProperty("weightActual")
    private Integer weightActual;
    /**
     * height
     */
    @JsonProperty("height")
    private BigDecimal height;


}
