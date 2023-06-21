package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 11:34
 */
@Getter
@Setter
public class PaymentRecord {

    /**
     * 收款方名称
     */
    @JsonProperty("recipientName")
    private String recipientName;
    /**
     * 合计金额
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
    /**
     * 付款方式
     */
    @JsonProperty("paymentMethod")
    private String paymentMethod;
    /**
     * 商品说明
     */
    @JsonProperty("description")
    private String description;
    /**
     * 支付时间
     */
    @JsonProperty("paymentTime")
    private String paymentTime;
    /**
     * 订单号
     */
    @JsonProperty("orderNumber")
    private String orderNumber;
}
