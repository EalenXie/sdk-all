package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@NoArgsConstructor
@Data
public class PublisIssues {
    /**
     * date
     */
    @JsonProperty("date")
    private String date;
    /**
     * transactableFlag
     */
    @JsonProperty("transactableFlag")
    private Boolean transactableFlag;
    /**
     * publishFlag
     */
    @JsonProperty("publishFlag")
    private Boolean publishFlag;
}
