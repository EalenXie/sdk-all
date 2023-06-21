package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/11/2 11:25
 */
@Getter
@Setter
public class Order {
    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("orderType")
    private String orderType;
    @JsonProperty("createType")
    private String createType;
    @JsonProperty("status")
    private String status;
    @JsonProperty("refNo")
    private String refNo;
    @JsonProperty("processAgain")
    private String processAgain;
    @JsonProperty("saleOrderCode")
    private String saleOrderCode;
    @JsonProperty("warehouseOrderCode")
    private String warehouseOrderCode;
    @JsonProperty("sysOrderCode")
    private String sysOrderCode;
    @JsonProperty("companyCode")
    private String companyCode;
    @JsonProperty("userAccount")
    private String userAccount;
    @JsonProperty("shippingMethod")
    private String shippingMethod;
    @JsonProperty("shippingMethodNo")
    private String shippingMethodNo;
    @JsonProperty("shippingMethodPlatform")
    private String shippingMethodPlatform;
    @JsonProperty("warehouseId")
    private String warehouseId;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("dateCreatePlatform")
    private String dateCreatePlatform;
    @JsonProperty("dateCreateSys")
    private String dateCreateSys;
    @JsonProperty("updateDate")
    private String updateDate;
    @JsonProperty("datePaidPlatform")
    private String datePaidPlatform;
    @JsonProperty("platformShipStatus")
    private String platformShipStatus;
    @JsonProperty("platformShipTime")
    private String platformShipTime;
    @JsonProperty("dateWarehouseShipping")
    private String dateWarehouseShipping;
    @JsonProperty("dateLatestShip")
    private String dateLatestShip;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("amountpaid")
    private String amountpaid;
    @JsonProperty("subtotal")
    private String subtotal;
    @JsonProperty("shipFee")
    private String shipFee;
    @JsonProperty("platformFeeTotal")
    private String platformFeeTotal;
    @JsonProperty("finalvaluefeeTotal")
    private String finalvaluefeeTotal;
    @JsonProperty("otherFee")
    private String otherFee;
    @JsonProperty("fbaFee")
    private String fbaFee;
    @JsonProperty("sellerRebate")
    private String sellerRebate;
    @JsonProperty("costShipFee")
    private String costShipFee;
    @JsonProperty("buyerId")
    private String buyerId;
    @JsonProperty("buyerName")
    private String buyerName;
    @JsonProperty("buyerMail")
    private String buyerMail;
    @JsonProperty("site")
    private String site;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("productCount")
    private String productCount;
    @JsonProperty("orderWeight")
    private String orderWeight;
    @JsonProperty("orderDesc")
    private String orderDesc;
    @JsonProperty("paypalTransactionId")
    private String paypalTransactionId;
    @JsonProperty("abnormalType")
    private String abnormalType;
    @JsonProperty("abnormalReason")
    private String abnormalReason;
    @JsonProperty("discount_val")
    private String discountVal;
    @JsonProperty("SystemTagEn")
    private String systemTagEn;
    @JsonProperty("SystemTagZh")
    private String systemTagZh;
    @JsonProperty("CustomTagEn")
    private String customTagEn;
    @JsonProperty("CustomTagZh")
    private String customTagZh;
    @JsonProperty("outboundBatchCarrier")
    private String outboundBatchCarrier;
    @JsonProperty("outboundBatchTrackingNo")
    private String outboundBatchTrackingNo;
    @JsonProperty("systemNote")
    private String systemNote;
    @JsonProperty("billNo")
    private String billNo;
    @JsonProperty("isMark")
    private String isMark;
    @JsonProperty("isCod")
    private String isCod;
    @JsonProperty("createrUserCode")
    private String createrUserCode;
    @JsonProperty("createrUserName")
    private String createrUserName;
    @JsonProperty("createrUserNameEn")
    private String createrUserNameEn;
    @JsonProperty("customerServiceNote")
    private String customerServiceNote;
    @JsonProperty("paypalAccount")
    private String paypalAccount;
    @JsonProperty("orderDetails")
    private List<OrderDetail> orderDetails;
    @JsonProperty("platformUserName")
    private String platformUserName;
    @JsonProperty("trackStatus")
    private String trackStatus;
    @JsonProperty("trackDeliveredTime")
    private String trackDeliveredTime;
}
