package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/25 14:51
 */
@Getter
@Setter
public class PcsOutboundCreate {
    private String outOrderId;
    private String bizSource;
    private String logisticsProductCode;
    private String dutyType;
    private String ioss;
    private String eori;
    private String vat;
    @JsonProperty("fpxTrackingNoList")
    private List<FpxTrackingNoDTO> fpxTrackingNoList;
    @JsonProperty("sender")
    private AddressInfo sender;
    @JsonProperty("receiver")
    private AddressInfo receiver;


}
