package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 11:18
 */
@NoArgsConstructor
@Data
public class LoadTypes {
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * loadType
     */
    @JsonProperty("loadType")
    private String loadType;
}
