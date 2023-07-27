package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 15:31
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fields")
    private String fields;
}
