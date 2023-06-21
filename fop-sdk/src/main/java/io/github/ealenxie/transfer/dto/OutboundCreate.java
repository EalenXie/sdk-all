package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 12:39
 */

@Getter
@Setter
public class OutboundCreate {

    @JsonProperty("businessType")
    private String businessType;
    @JsonProperty("deliverToRecipientInfo")
    private DeliverToRecipientInfo deliverToRecipientInfo;
    @JsonProperty("destinationAreaCode")
    private String destinationAreaCode;
    @JsonProperty("destinationCountry")
    private String destinationCountry;
    @JsonProperty("dutyType")
    private String dutyType;
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
    @JsonProperty("fpxTrackingNoList")
    private List<String> fpxTrackingNoList;
    @JsonProperty("isInsure")
    private String isInsure;
    @JsonProperty("logisticsServiceInfo")
    private LogisticsServiceInfo logisticsServiceInfo;
    @JsonProperty("memberCode")
    private String memberCode;
    @JsonProperty("needAddAddress")
    private Boolean needAddAddress;
    @JsonProperty("recipientInfo")
    private RecipientInfo recipientInfo;
    @JsonProperty("returnInfo")
    private ReturnInfo returnInfo;
    @JsonProperty("salesPlatform")
    private String salesPlatform;
    @JsonProperty("sender")
    private RecipientInfo sender;
    @JsonProperty("serialNo")
    private String serialNo;
    @JsonProperty("tradeId")
    private String tradeId;
    @JsonProperty("tradeTime")
    private Long tradeTime;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
}
