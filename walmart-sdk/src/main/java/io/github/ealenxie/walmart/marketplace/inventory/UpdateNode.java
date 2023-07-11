package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 17:51
 * @version 1.0
 */
@Getter
@Setter
public class UpdateNode {
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    private String shipNode;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
