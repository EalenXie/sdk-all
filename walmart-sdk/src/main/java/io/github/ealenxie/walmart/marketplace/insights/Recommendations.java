package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:14
 */
@Getter
@Setter
public class Recommendations {
    /**
     * listingQualityCatalog
     */
    @JsonProperty("listingQualityCatalog")
    private String listingQualityCatalog;
}
