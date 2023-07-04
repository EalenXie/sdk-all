package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 13:21
 * @version 1.0
 */
@Getter
@Setter
public class CustomerResponse {

    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * customerReturns
     */
    @JsonProperty("customerReturns")
    private List<CustomerReturns> customerReturns;
}
