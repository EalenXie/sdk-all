package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {


    /**
     * 事务id
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 订单id
     */
    @JsonProperty("order_id")
    private Long orderId;
    /**
     * 事务类型
     * authorization: Money that the customer has agreed to pay. The authorization period can be between 7 and 30 days (depending on your payment service) while a store waits for a payment to be captured.
     * capture: A transfer of money that was reserved during the authorization of a shop.
     * sale: The authorization and capture of a payment performed in one single step.
     * void: The cancellation of a pending authorization or capture.
     * refund: The partial or full return of captured money to the customer.
     */
    @JsonProperty("kind")
    private String kind;
    /**
     * 网关名称
     */
    @JsonProperty("gateway")
    private String gateway;
    /**
     * 事务状态 pending, failure, success, error
     */
    @JsonProperty("status")
    private String status;
    /**
     * 支付成功或失败的消息
     */
    @JsonProperty("message")
    private String message;
    /**
     * 创建时间
     */
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * 是否为测试数据
     */
    @JsonProperty("test")
    private Boolean test;
    /**
     * 授权信息
     */
    @JsonProperty("authorization")
    private String authorization;
    /**
     * 处理事务的位置id
     */
    @JsonProperty("location_id")
    private String locationId;
    /**
     * Shopify 用户id
     */
    @JsonProperty("user_id")
    private String userId;
    /**
     * 关联的事务id
     */
    @JsonProperty("parent_id")
    private String parentId;
    /**
     * 交易处理时间
     */
    @JsonProperty("processed_at")
    private String processedAt;
    /**
     * 设备id
     */
    @JsonProperty("device_id")
    private String deviceId;
    /**
     * 错误代码
     * incorrect_number
     * invalid_number
     * invalid_expiry_date
     * invalid_cvc
     * expired_card
     * incorrect_cvc
     * incorrect_zip
     * incorrect_address
     * card_declined
     * processing_error
     * call_issuer
     * pick_up_card
     */
    @JsonProperty("error_code")
    private String errorCode;
    /**
     * 交易起源 web、pos、iphone、android
     */
    @JsonProperty("source_name")
    private String sourceName;

    /**
     * 收据
     */
    @JsonProperty("receipt")
    private ReceiptVO receipt;

    /**
     * 交易金额
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * 货币代码
     */
    @JsonProperty("currency")
    private String currency;


    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;

}
