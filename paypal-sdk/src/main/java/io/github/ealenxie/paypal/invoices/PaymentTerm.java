package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@NoArgsConstructor
@Data
public class PaymentTerm {
    /**
     * termType
     */
    @JsonProperty("term_type")
    private String termType;
    /**
     * dueDate
     */
    @JsonProperty("due_date")
    private String dueDate;
}
