package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 14:14
 */
@NoArgsConstructor
@Data
public class MeetsCriteria {
    /**
     * activeDaysCriteriaMet
     */
    @JsonProperty("activeDaysCriteriaMet")
    private Boolean activeDaysCriteriaMet;
    /**
     * ordersCriteriaMet
     */
    @JsonProperty("ordersCriteriaMet")
    private Boolean ordersCriteriaMet;
    /**
     * deliveryDefectCriteriaMet
     */
    @JsonProperty("deliveryDefectCriteriaMet")
    private Boolean deliveryDefectCriteriaMet;
    /**
     * cancellationCriteriaMet
     */
    @JsonProperty("cancellationCriteriaMet")
    private Boolean cancellationCriteriaMet;
    /**
     * listingQualityCatalogCriteriaMet
     */
    @JsonProperty("listingQualityCatalogCriteriaMet")
    private Boolean listingQualityCatalogCriteriaMet;
}
