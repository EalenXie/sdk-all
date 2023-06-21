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
public class InboundCreate {

    @JsonProperty("serialNo")
    private String serialNo;
    @JsonProperty("refNo")
    private String refNo;
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
    @JsonProperty("labelBarcode")
    private String labelBarcode;
    @JsonProperty("businessType")
    private String businessType;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("dutyType")
    private String dutyType;
    @JsonProperty("cargoType")
    private String cargoType;
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
    @JsonProperty("valueAddedServicesList")
    private List<ValueAddedService> valueAddedServiceList;
    @JsonProperty("productList")
    private List<Product> productList;
    @JsonProperty("deliverTypeInfo")
    private DeliverTypeInfo deliverTypeInfo;
    @JsonProperty("returnInfo")
    private ReturnInfo returnInfo;
}
