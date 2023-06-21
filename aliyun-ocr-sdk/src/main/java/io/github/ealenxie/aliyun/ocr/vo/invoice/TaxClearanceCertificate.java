package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/4 13:03
 */
@Getter
@Setter
public class TaxClearanceCertificate {

    /**
     * 填发日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 编号
     */
    @JsonProperty("certificateNumber")
    private String certificateNumber;
    /**
     * 税务机关
     */
    @JsonProperty("taxAuthorityName")
    private String taxAuthorityName;
    /**
     * 联次
     */
    @JsonProperty("formType")
    private String formType;
    /**
     * 纳税人识别号
     */
    @JsonProperty("taxNumbe")
    private String taxNumbe;
    /**
     * 纳税人名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 合计金额（大写）
     */
    @JsonProperty("totalAmountInWords")
    private String totalAmountInWords;
    /**
     * 合计金额（小写）
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
    /**
     * 填票人
     */
    @JsonProperty("drawer")
    private String drawer;
    /**
     * 备注
     */
    @JsonProperty("remarks")
    private String remarks;
    /**
     * 完税详单
     */
    @JsonProperty("taxClearanceDetails")
    private List<TaxClearanceDetails> taxClearanceDetails;
}
