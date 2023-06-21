package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 11:03
 */
@Getter
@Setter
public class NonTaxInvoiceDetails {
    /**
     * 项目编号
     */
    @JsonProperty("number")
    private String number;
    /**
     * 项目编号
     */
    @JsonProperty("name")
    private String name;
    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 规格型号
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 单位
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private String quantity;
    /**
     * 金额
     */
    @JsonProperty("amount")
    private String amount;

}
