package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/26 17:03
 **/
@Getter
@Setter
public class PayoutResponse {

    /**
     *  The payout header.
     */
    @JsonProperty("batch_header")
    private BatchHeader batchHeader;
    /**
     *  An array of request-related HATEOAS links.
     */
    @JsonProperty("links")
    private List<Link> links;
}

