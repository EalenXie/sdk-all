package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 11:18
 */
@Getter
@Setter
public class LoadTypes {
    /**
     * count
     */
    @JsonProperty("count")
    private String count;
    /**
     * loadType
     */
    @JsonProperty("loadType")
    private String loadType;
}
