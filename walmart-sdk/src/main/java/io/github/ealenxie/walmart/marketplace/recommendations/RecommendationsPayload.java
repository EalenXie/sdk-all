package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 11:34
 */
@Getter
@Setter
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
