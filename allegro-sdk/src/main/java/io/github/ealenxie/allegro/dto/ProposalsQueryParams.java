package io.github.ealenxie.allegro.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/4 9:04
 */
@Getter
@Setter
public class ProposalsQueryParams {
    /**
     * Array of strings <= 100 items [ items <= 100 characters ]
     * Ids of parcels. Passing more than one value will search pickup dates for all of them separately.
     * Example: parcelId=adc05c84-a9eb-4981-bbc0-773d8c0017e7&parcelId=adc05c84-a9eb-4981-bbc0-773d8c0017e8 - will
     * return pickup date proposals for parcels with ID adc05c84-a9eb-4981-bbc0-773d8c0017e7 and adc05c84-a9eb-4981-bbc0-773d8c0017e8.
     */
    private String parcelId;
    /**
     * string <date>
     * Example: readyDate=2020-01-01
     * Date when parcels will be ready.
     */
    private String readyDate;
}
