package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/4/1 15:51
 * 增值税发票{@link Invoice}详单
 */
@Getter
@Setter
public class InvoiceDetails {

    /**
     * 货物或应税劳务、服务名称
     */
    @JsonProperty("itemName")
    private String itemName;
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
     * 单价
     */
    @JsonProperty("unitPrice")
    private String unitPrice;
    /**
     * 金额
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * 税率
     */
    @JsonProperty("taxRate")
    private String taxRate;
    /**
     * 税额
     */
    @JsonProperty("tax")
    private String tax;
}
