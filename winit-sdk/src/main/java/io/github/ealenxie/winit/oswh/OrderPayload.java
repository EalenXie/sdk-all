package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 16:11
 * @version 1.0
 */
@Getter
@Setter
public class OrderPayload {
    /**
     * volume
     */
    @JsonProperty("volume")
    private Double volume;
    /**
     * inspectionVolume
     */
    @JsonProperty("inspectionVolume")
    private Object inspectionVolume;
    /**
     * orderCreateDate
     */
    @JsonProperty("orderCreateDate")
    private String orderCreateDate;
    /**
     * inspectionTotalItemQty
     */
    @JsonProperty("inspectionTotalItemQty")
    private Object inspectionTotalItemQty;
    /**
     * orderNo
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * totalPackageQty
     */
    @JsonProperty("totalPackageQty")
    private Integer totalPackageQty;
    /**
     * inspectionTotalPackageQty
     */
    @JsonProperty("inspectionTotalPackageQty")
    private Object inspectionTotalPackageQty;
    /**
     * totalItemQty
     */
    @JsonProperty("totalItemQty")
    private Integer totalItemQty;
    /**
     * weight
     */
    @JsonProperty("weight")
    private Integer weight;
    /**
     * inspectionWeight
     */
    @JsonProperty("inspectionWeight")
    private Object inspectionWeight;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
