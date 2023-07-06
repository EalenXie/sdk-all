package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.NameValuePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 15:38
 * @version 1.0
 */
@Setter
@Getter
public class VariantGroupInfo {
    /**
     * groupingAttributes
     */
    @JsonProperty("groupingAttributes")
    private List<NameValuePayload> groupingAttributes;
    /**
     * isPrimary
     */
    @JsonProperty("isPrimary")
    private String isPrimary;
}
