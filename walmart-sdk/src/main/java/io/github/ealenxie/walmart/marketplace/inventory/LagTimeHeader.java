package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/12 11:23
 * @version 1.0
 */
@Getter
@Setter
public class LagTimeHeader {
    /**
     * version
     */
    @JsonProperty("version")
    private String version;
    /**
     * feedDate
     */
    @JsonProperty("feedDate")
    private String feedDate;
}
