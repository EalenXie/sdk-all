package io.github.ealenxie.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.fulfillment.vo.ConsigneeInfo;
import io.github.ealenxie.fulfillment.vo.LogisticsServiceInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 14:28
 */
@Getter
@Setter
public class ExternalCreate {

    @JsonProperty("ref_no")
    private String refNo;
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("duty_type")
    private String dutyType;
    @JsonProperty("cargo_type")
    private String cargoType;
    @JsonProperty("sales_platform")
    private String salesPlatform;
    @JsonProperty("delivery_date")
    private String deliveryDate;
    @JsonProperty("delivery_timeslot")
    private String deliveryTimeslot;
    @JsonProperty("partition_code")
    private String partitionCode;
    @JsonProperty("route_code")
    private String routeCode;
    @JsonProperty("extend_field")
    private String extendField;
    @JsonProperty("logistics_service_info")
    private LogisticsServiceInfo logisticsServiceInfo;
    @JsonProperty("consignee_info")
    private ConsigneeInfo consigneeInfo;
    @JsonProperty("shipper")
    private Shipper shipper;
    @JsonProperty("pickup")
    private Shipper pickup;
    @JsonProperty("parcel_desc")
    private List<ParcelDesc> parcelDesc;
    @JsonProperty("sku_list")
    private List<ExternalSku> skuList;
}
