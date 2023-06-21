package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 20:17
 */
@Getter
@Setter
public class DirectShipCreate {


    @JsonProperty("serialNo")
    private String serialNo;
    @JsonProperty("refNo")
    private String refNo;
    @JsonProperty("status")
    private String status;
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
    @JsonProperty("labelBarcode")
    private String labelBarcode;
    @JsonProperty("businessType")
    private String businessType;
    @JsonProperty("dutyType")
    private String dutyType;
    @JsonProperty("cargoType")
    private String cargoType;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("destinationCountry")
    private String destinationCountry;
    @JsonProperty("buyerId")
    private String buyerId;
    @JsonProperty("salesPlatform")
    private String salesPlatform;
    @JsonProperty("tradeId")
    private String tradeId;
    @JsonProperty("sellerId")
    private String sellerId;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("parcelValue")
    private Double parcelValue;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("includeBattery")
    private String includeBattery;
    @JsonProperty("batteryType")
    private String batteryType;
    @JsonProperty("productList")
    private List<Product> productList;
    @JsonProperty("deliverTypeInfo")
    private DeliverTypeInfo deliverTypeInfo;
    @JsonProperty("logisticsServiceInfo")
    private LogisticsServiceInfo logisticsServiceInfo;
    @JsonProperty("isInsure")
    private String isInsure;
    @JsonProperty("insuranceInfo")
    private InsuranceInfo insuranceInfo;
    @JsonProperty("sender")
    private Sender sender;
    @JsonProperty("recipientInfo")
    private RecipientInfo recipientInfo;
    @JsonProperty("deliverToRecipientInfo")
    private DeliverToRecipientInfo deliverToRecipientInfo;
    @JsonProperty("returnInfo")
    private ReturnInfo returnInfo;
}
