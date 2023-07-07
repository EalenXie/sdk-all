package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 14:18
 */
@NoArgsConstructor
@Data
public class UnpublishedItemsResponse {

    /**
     * payload
     */
    @JsonProperty("payload")
    private List<UnpublishedItemPayload> payload;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * totalGmvAmount
     */
    @JsonProperty("totalGmvAmount")
    private Money totalGmvAmount;
}
