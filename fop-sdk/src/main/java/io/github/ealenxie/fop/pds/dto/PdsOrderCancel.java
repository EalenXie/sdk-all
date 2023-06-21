package io.github.ealenxie.fop.pds.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:53
 */
@Getter
@Setter
public class PdsOrderCancel {


    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
    @JsonProperty("logisticsCode")
    private String logisticsCode;
    @JsonProperty("bagNo")
    private String bagNo;
    @JsonProperty("plateNo")
    private String plateNo;
    @JsonProperty("labelNo")
    private String labelNo;
    @JsonProperty("businessType")
    private String businessType;
}
