package io.github.ealenxie.fop.direct;

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
    /**
     * 当前请求流水（唯一）
     */
    private String outOrderId;

    /**
     * 平台唯一标识，由系统分配
     */
    private String bizSource;

    /**
     * 物流产品代码
     */
    private String logisticsProductCode;

    /**
     * 税费费用承担方式(可选值：U、P);
     * <p>
     * U：DDU由收件人支付关税;
     * <p>
     * P：DDP 由寄件方支付关税
     * <p>
     * （如果物流产品只提供其中一种，则以4PX提供的为准）
     */
    private String dutyType;

    /**
     * IOSS号码
     */
    private String ioss;

    /**
     * EORI号码
     */
    private String eori;

    /**
     * VAT税号
     */
    private String vat;

    /**
     * 一段包裹列表
     */
    @JsonProperty("fpxTrackingNoList")
    private List<PcsOutboundFpxTrackingNo> fpxTrackingNoList;

    /**
     * 发件人信息
     */
    @JsonProperty("sender")
    private AddressInfo sender;

    /**
     * 收件人信息
     */
    @JsonProperty("receiver")
    private AddressInfo receiver;


}
