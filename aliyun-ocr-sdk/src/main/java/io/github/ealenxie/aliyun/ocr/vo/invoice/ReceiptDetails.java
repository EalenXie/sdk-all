package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 12:47
 */
@Getter
@Setter
public class ReceiptDetails {

    /**
     * 小记
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * 品名
     */
    @JsonProperty("itemName")
    private String itemName;
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
}
