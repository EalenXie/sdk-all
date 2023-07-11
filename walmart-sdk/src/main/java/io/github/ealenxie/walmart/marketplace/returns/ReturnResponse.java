package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Meta;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/11 10:10
 * @version 1.0
 */
@Getter
@Setter
public class ReturnResponse {

    /**
     * meta
     */
    @JsonProperty("meta")
    private Meta meta;
    /**
     * returnOrders
     */
    @JsonProperty("returnOrders")
    private List<ReturnOrder> returnOrders;
}
