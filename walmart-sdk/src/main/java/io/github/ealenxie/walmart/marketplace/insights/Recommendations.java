package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 14:14
 */
@NoArgsConstructor
@Data
public class Recommendations {
    /**
     * listingQualityCatalog
     */
    @JsonProperty("listingQualityCatalog")
    private String listingQualityCatalog;
}
