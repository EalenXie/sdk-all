package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/4/3 12:58
 * 航空行程单
 */
@Getter
@Setter
public class AirItinerary {


    /**
     * 国内国际标签
     */
    @JsonProperty("internationalFlightSign")
    private String internationalFlightSign;
    /**
     * 印刷序号
     */
    @JsonProperty("serialNumber")
    private String serialNumber;
    /**
     * 旅客姓名
     */
    @JsonProperty("passengerName")
    private String passengerName;
    /**
     * 有效身份证号码
     */
    @JsonProperty("idCardNumber")
    private String idCardNumber;
    /**
     * 签注
     */
    @JsonProperty("endorsement")
    private String endorsement;
    /**
     * 票价
     */
    @JsonProperty("fare")
    private String fare;
    /**
     * 民航发展基金
     */
    @JsonProperty("caacDevelopmentFund")
    private String caacDevelopmentFund;
    /**
     * 燃油附加费
     */
    @JsonProperty("fuelSurcharge")
    private String fuelSurcharge;
    /**
     * 合计
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
    /**
     * 电子客票号码
     */
    @JsonProperty("ticketNumber")
    private String ticketNumber;
    /**
     * 验证码
     */
    @JsonProperty("validationCode")
    private String validationCode;
    /**
     * 提示信息
     */
    @JsonProperty("promptMessage")
    private String promptMessage;
    /**
     * 保险费
     */
    @JsonProperty("insurance")
    private String insurance;
    /**
     * 销售单位代号
     */
    @JsonProperty("agentCode")
    private String agentCode;
    /**
     * 填开单位
     */
    @JsonProperty("issueCompany")
    private String issueCompany;
    /**
     * 填开日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * PNR码
     */
    @JsonProperty("pnrCode")
    private String pnrCode;
    /**
     * 其他税费
     */
    @JsonProperty("otherTaxes")
    private String otherTaxes;
    /**
     * 航班详单
     * {@link Flight}
     */
    @JsonProperty("flights")
    private List<Flight> flights;
}
