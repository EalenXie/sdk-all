package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 15:43
 * @version 1.0
 */
@Getter
@Setter
public class ItemAssociation {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * associations
     */
    @JsonProperty("associations")
    private List<Associations> associations;
}
