package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@JsonIgnoreProperties(value = {"extended_authorization_attributes"})
public class OrderTransactionDTO {
    private long id;
    @JsonProperty("order_id")
    private long orderId;
    private String kind;
    private String gateway;
    private String status;
    private String message;
    @JsonProperty("created_at")
    private Date createdAt;
    private boolean test;
    private String authorization;
    @JsonProperty("location_id")
    private String locationId;
    @JsonProperty("user_id")
    private long userId;
    @JsonProperty("parent_id")
    private long parentId;
    @JsonProperty("processed_at")
    private Date processedAt;
    @JsonProperty("device_id")
    private String deviceId;
    @JsonProperty("error_code")
    private String errorCode;
    @JsonProperty("source_name")
    private String sourceName;
    @JsonProperty("payment_details")
    private PaymentDetailsDTO paymentDetails;
    private ReceiptDTO receipt;
    private String amount;
    private String currency;
    @JsonProperty("authorization_expires_at")
    private String authorizationExpiresAt;
    @JsonProperty("extended_authorization_attributes")
    private String extendedAuthorizationAttributes;
    @JsonProperty("payments_refund_attributes")
    private PaymentsRefundAttributesDTO paymentsRefundAttributes;
    @JsonProperty("payment_id")
    private String paymentId;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
}
