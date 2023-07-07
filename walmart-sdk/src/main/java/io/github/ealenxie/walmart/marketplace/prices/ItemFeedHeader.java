package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/7 17:22
 * @version 1.0
 */
@Getter
@Setter
public class ItemFeedHeader {
    /**
     * processMode
     */
    @JsonProperty("processMode")
    private String processMode;
    /**
     * subset
     */
    @JsonProperty("subset")
    private String subset;
    /**
     * mart
     */
    @JsonProperty("mart")
    private String mart;
    /**
     * sellingChannel
     */
    @JsonProperty("sellingChannel")
    private String sellingChannel;
    /**
     * version
     */
    @JsonProperty("version")
    private String version;
    /**
     * locale
     */
    @JsonProperty("locale")
    private String locale;
}
