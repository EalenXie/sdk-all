package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/20 16:17
 */
@Getter
@Setter
public class InvoiceItem {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private String quantity;
    /**
     * unitAmount
     */
    @JsonProperty("unit_amount")
    private Money unitAmount;
    /**
     * tax
     */
    @JsonProperty("tax")
    private TaxAmount tax;
    /**
     * discount
     */
    @JsonProperty("discount")
    private PercentMoney discount;
    /**
     * unitOfMeasure
     */
    @JsonProperty("unit_of_measure")
    private String unitOfMeasure;
}
