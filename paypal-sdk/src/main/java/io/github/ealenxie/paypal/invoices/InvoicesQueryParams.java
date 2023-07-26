package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/21 10:20
 */
@Getter
@Setter
public class InvoicesQueryParams extends PageQueryParams {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fields")
    private String fields;


}
