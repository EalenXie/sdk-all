package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class EuVatCustomsDeclaration {
    @JsonProperty("product")
    private Product product;
    @JsonProperty("merchant_identity")
    private String merchantIdentity;
    @JsonProperty("vat_paid_in_authority_currency")
    private Money vatPaidInAuthorityCurrency;
    @JsonProperty("vat_paid_in_customer_currency")
    private Money vatPaidInCustomerCurrency;
    @JsonProperty("shipping_cost_in_customer_currency")
    private Money shippingCostInCustomerCurrency;
    @JsonProperty("customer_identity")
    private String customerIdentity;
    @JsonProperty("vat_payer")
    private VatPayer vatPayer;
    @JsonProperty("merchant_address")
    private ShippingDetail merchantAddress;
    @JsonProperty("invoice_amount_in_customer_currency")
    private Money invoiceAmountInCustomerCurrency;
    @JsonProperty("shipping_cost_in_authority_currency")
    private Money shippingCostInAuthorityCurrency;
    @JsonProperty("invoice_amount_in_authority_currency")
    private Money invoiceAmountInAuthorityCurrency;
    @JsonProperty("customer_address")
    private ShippingDetail customerAddress;
    @JsonProperty("merchant_name")
    private String merchantName;
    @JsonProperty("platform_status")
    private String platformStatus;
    @JsonProperty("customer_name")
    private String customerName;
}
