package io.github.ealenxie.fop.pds.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/27 15:44
 */
@Getter
@Setter
public class PdsOrderCreate {


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
    @JsonProperty("cargoType")
    private String cargoType;
    @JsonProperty("cargoSpecification")
    private String cargoSpecification;
    @JsonProperty("logisticsServiceInfo")
    private LogisticsServiceInfo logisticsServiceInfo;
    @JsonProperty("returnInfo")
    private AddressInfo returnInfo;
    @JsonProperty("parcelList")
    private List<Parcel> parcelList;
    @JsonProperty("recipientInfo")
    private AddressInfo recipientInfo;
    @JsonProperty("deliverToRecipientInfo")
    private DeliverToRecipientInfo deliverToRecipientInfo;
    @JsonProperty("feeInfo")
    private FeeInfo feeInfo;
}
