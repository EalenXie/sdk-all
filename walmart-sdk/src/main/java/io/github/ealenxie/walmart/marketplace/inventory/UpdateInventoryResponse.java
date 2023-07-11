package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/11 17:51
 * @version 1.0
 */
@Getter
@Setter
public class UpdateInventoryResponse {

    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * nodes
     */
    @JsonProperty("nodes")
    private List<UpdateNode> nodes;
}
