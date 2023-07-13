package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class RevShare {
    @JsonProperty("destination_region")
    private String destinationRegion;
    @SuppressWarnings("all")
    @JsonProperty("rev_share")
    private Integer revShare;
    @JsonProperty("product_category")
    private String productCategory;
    @JsonProperty("entity_region")
    private String entityRegion;
    @JsonProperty("source_region")
    private String sourceRegion;
    @JsonProperty("shipping_type")
    private String shippingType;
}
