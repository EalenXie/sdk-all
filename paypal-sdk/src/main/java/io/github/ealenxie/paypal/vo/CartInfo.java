package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CartInfo {

    @JsonProperty("tax_inclusive")
    private String taxInclusive;

    @JsonProperty("paypal_invoice_id")
    private String paypalInvoiceId;

    /**
     * 商品详情
     */
    @JsonProperty("item_details")
    private List<ItemDetail> itemDetails;

}
