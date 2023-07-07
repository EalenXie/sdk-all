package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 11:34
 */
@NoArgsConstructor
@Data
public class RecommendationsPayload {

    /**
     * recommendationType
     */
    @JsonProperty("recommendationType")
    private String recommendationType;
    /**
     * meta
     */
    @JsonProperty("meta")
    private RecordsMeta meta;
    /**
     * records
     */
    @JsonProperty("records")
    private List<RecommendationRecord> records;
}
