package io.github.ealenxie.walmart.marketplace.onerequestreport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 17:50
 */
@Getter
@Setter
public class RowFilters {
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * columnName
     */
    @JsonProperty("columnName")
    private String columnName;
    /**
     * from
     */
    @JsonProperty("from")
    private String from;
    /**
     * to
     */
    @JsonProperty("to")
    private String to;
    /**
     * values
     */
    @JsonProperty("values")
    private List<String> values;
}
