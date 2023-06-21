package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/4 12:46
 */
@Getter
@Setter
public class ShoppingReceipt {
    /**
     * 联系电话
     */
    @JsonProperty("contactNumber")
    private String contactNumber;
    /**
     * 开票日期
     */
    @JsonProperty("receiptDate")
    private String receiptDate;
    /**
     * 商品详单
     */
    @JsonProperty("receiptDetails")
    private List<ReceiptDetails> receiptDetails;
    /**
     * 开票时间
     */
    @JsonProperty("receiptTime")
    private String receiptTime;
    /**
     * 地址
     */
    @JsonProperty("shopAddress")
    private String shopAddress;
    /**
     * 开票方名称
     */
    @JsonProperty("shopName")
    private String shopName;
    /**
     * 合计(实付)金额
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
}
