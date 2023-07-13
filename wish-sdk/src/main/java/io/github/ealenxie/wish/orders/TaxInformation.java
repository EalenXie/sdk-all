package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class TaxInformation {
    @JsonProperty("transaction_tax")
    private List<TransactionTax> transactionTax;
    @JsonProperty("customer_identity_number_type")
    private String customerIdentityNumberType;
    @JsonProperty("vat_information")
    private VatInformation vatInformation;
    @JsonProperty("customer_identity_number")
    private String customerIdentityNumber;
}
