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
    private String inspectionVolume;
    /**
     * orderCreateDate
     */
    @JsonProperty("orderCreateDate")
    private String orderCreateDate;
    /**
     * inspectionTotalItemQty
     */
    @JsonProperty("inspectionTotalItemQty")
    private String inspectionTotalItemQty;
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
    private String inspectionTotalPackageQty;
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
    private String inspectionWeight;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
