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

    /**
     * 4PX跟踪号（预分配号段的客户可传此值）
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 外部物流单号（客户自有系统的单号，如客户单号），映射到外部物流单号logistics_code
     */
    @JsonProperty("logisticsCode")
    private String logisticsCode;

    /**
     * 袋号
     */
    @JsonProperty("bagNo")
    private String bagNo;

    /**
     * 卡板号
     */
    @JsonProperty("plateNo")
    private String plateNo;

    /**
     * 面单号（预分配号段的客户可传此值）
     */
    @JsonProperty("labelNo")
    private String labelNo;

    /**
     * 业务类型（京广速递：KING_KONG）
     */
    @JsonProperty("businessType")
    private String businessType;

    /**
     * 货物类型（1：礼品;2：文件;3：商品货样;5：其它）
     * <p>
     * 默认值：5
     */
    @JsonProperty("cargoType")
    private String cargoType;

    /**
     * 货物规格，中件：MIDDLE
     */
    @JsonProperty("cargoSpecification")
    private String cargoSpecification;

    /**
     * 物流服务信息（跟末端服务商映射）
     */
    @JsonProperty("logisticsServiceInfo")
    private LogisticsServiceInfo logisticsServiceInfo;

    /**
     * 退件信息
     */
    @JsonProperty("returnInfo")
    private AddressInfo returnInfo;

    /**
     * 包裹列表（一单一包）
     */
    @JsonProperty("parcelList")
    private List<Parcel> parcelList;

    /**
     * 收件人信息
     */
    @JsonProperty("recipientInfo")
    private AddressInfo recipientInfo;

    /**
     * 投递信息
     */
    @JsonProperty("deliverToRecipientInfo")
    private DeliverToRecipientInfo deliverToRecipientInfo;

    /**
     * 费用信息
     */
    @JsonProperty("feeInfo")
    private FeeInfo feeInfo;
}
