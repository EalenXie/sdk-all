package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


/**
 * @author EalenXie
 * @since 2022/08/09 14:41
 */
@Getter
@Setter
public class FinanceResource {
    @JsonProperty("transactions")
    private List<Transaction> transactions;
}
