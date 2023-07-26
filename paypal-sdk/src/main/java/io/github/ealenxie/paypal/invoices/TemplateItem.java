package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 10:51
 */
@Getter
@Setter
public class TemplateItem {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
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
    private Amount unitAmount;
    /**
     * tax
     */
    @JsonProperty("tax")
    private TemplateItemTax tax;
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
