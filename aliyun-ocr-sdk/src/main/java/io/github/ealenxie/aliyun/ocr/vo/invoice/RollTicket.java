package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/4/4 9:59
 */
@Getter
@Setter
public class RollTicket {

    /**
     * 发票代码
     */
    @JsonProperty("invoiceCode")
    private String invoiceCode;
    /**
     * 发票号码
     */
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;
    /**
     * 开票日期
     */
    @JsonProperty("invoiceDate")
    private String invoiceDate;
    /**
     * 机器编码
     */
    @JsonProperty("machineCode")
    private String machineCode;
    /**
     * 校验码
     */
    @JsonProperty("checkCode")
    private String checkCode;
    /**
     * 受票方名称
     */
    @JsonProperty("purchaserName")
    private String purchaserName;

    /**
     * 大写金额
     */
    @JsonProperty("totalAmountInWords")
    private String totalAmountInWords;
    /**
     * 发票金额
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
    /**
     * 销售方名称
     */
    @JsonProperty("sellerName")
    private String sellerName;
    /**
     * 销售方税号
     */
    @JsonProperty("sellerTaxNumber")
    private String sellerTaxNumber;
    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;
    /**
     * 购买方税号
     */
    @JsonProperty("purchaserTaxCode")
    private String purchaserTaxCode;
    /**
     * 收款员
     */
    @JsonProperty("cashier")
    private String cashier;
    /**
     * 发票详单
     */
    @JsonProperty("invoiceDetails")
    private List<RollTicketDetails> invoiceDetails;
}
