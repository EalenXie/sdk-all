package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/20 10:58
 **/
@Getter
@Setter
public class Detail {
    /**
     * subtotal
     */
    @JsonProperty("subtotal")
    private String subtotal;
}

