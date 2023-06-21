package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/4 12:34
 */
@Getter
@Setter
public class PurchaseRecord {

    /**
     * 订单编号
     */
    @JsonProperty("orderNumber")
    private String orderNumber;
    /**
     * 交易时间
     */
    @JsonProperty("transactionTime")
    private String transactionTime;
    /**
     * 收货信息
     */
    @JsonProperty("deliveryInfo")
    private String deliveryInfo;
    /**
     * 交易金额
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
    /**
     * 店铺名称
     */
    @JsonProperty("shopName")
    private String shopName;
    /**
     * 商品详单
     */
    @JsonProperty("shoppingDetails")
    private List<ShoppingDetails> shoppingDetails;


}
