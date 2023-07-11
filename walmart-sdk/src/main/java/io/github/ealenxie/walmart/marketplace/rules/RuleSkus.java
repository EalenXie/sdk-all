package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 9:53
 */
@NoArgsConstructor
@Data
public class RuleSkus {
    /**
     * skus
     */
    @JsonProperty("skus")
    private List<SkuPayload> skus;
}
