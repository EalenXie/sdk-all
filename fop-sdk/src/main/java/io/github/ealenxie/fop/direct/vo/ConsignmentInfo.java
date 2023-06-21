package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:15
 */
@Getter
@Setter
public class ConsignmentInfo {
    @JsonProperty("4px_inbound_date")
    private Long fpxInboundDate;
    @JsonProperty("4px_outbound_date")
    private Long fpxOutboundDate;
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;
    @JsonProperty("consignment_create_date")
    private Long consignmentCreateDate;
    @JsonProperty("consignment_status")
    private String consignmentStatus;
    @JsonProperty("ds_consignment_no")
    private String dsConsignmentNo;
    @JsonProperty("has_check_oda")
    private String hasCheckOda;
    @JsonProperty("insure_status")
    private String insureStatus;
    @JsonProperty("insure_type")
    private String insureType;
    @JsonProperty("is_hold_sign")
    private String isHoldSign;
    @JsonProperty("logistics_channel_no")
    private String logisticsChannelNo;
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;
    @JsonProperty("logistics_product_name")
    private String logisticsProductName;
    @JsonProperty("oda_result_sign")
    private String odaResultSign;
    @JsonProperty("ref_no")
    private String refNo;
}
