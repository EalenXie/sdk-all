package io.github.ealenxie.walmart.marketplace.feeds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 14:34
 * @version 1.0
 */
@Getter
@Setter
public class ItemIngestionStatus {
    /**
     * martId
     */
    @JsonProperty("martId")
    private Integer martId;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * wpid
     */
    @JsonProperty("wpid")
    private String wpid;
    /**
     * index
     */
    @JsonProperty("index")
    private Integer index;
    /**
     * itemid
     */
    @JsonProperty("itemid")
    private String itemid;
    /**
     * productIdentifiers
     */
    @JsonProperty("productIdentifiers")
    private ProductIdentifiers productIdentifiers;
    /**
     * ingestionStatus
     */
    @JsonProperty("ingestionStatus")
    private String ingestionStatus;
}
