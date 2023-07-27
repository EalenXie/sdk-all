package io.github.ealenxie.paypal.referencedpayouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/25 15:00
 **/
@Getter
@Setter
public class PayoutDirective {
    /**
     * 	The destination can be one of the specified directive type that receives the payout.
     */
    @JsonProperty("destination")
    private String destination;
    /**
     * 	The directive type.
     * 	<p> {@link DirectiveType}</p>
     */
    @JsonProperty("type")
    private String type;
}

