package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 12:20
 */
@NoArgsConstructor
@Data
public class CategorizationPayload {


    /**
     * categorizationType
     */
    @JsonProperty("categorizationType")
    private String categorizationType;
    /**
     * meta
     */
    @JsonProperty("meta")
    private RecordsMeta meta;
    /**
     * records
     */
    @JsonProperty("records")
    private List<CategorizationRecord> records;
}
