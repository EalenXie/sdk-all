package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/20 10:57
 **/
@Getter
@Setter
public class Amount {

    /**
     * total
     */
    @JsonProperty("total")
    private String total;
    /**
     * currency
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * details
     */
    @JsonProperty("details")
    private Detail details;
}

