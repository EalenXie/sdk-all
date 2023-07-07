package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 14:53
 */
@NoArgsConstructor
@Data
public class PostPurchaseQuality {
    /**
     * itemDefectCnt
     */
    @JsonProperty("itemDefectCnt")
    private Integer itemDefectCnt;
    /**
     * defectRatio
     */
    @JsonProperty("defectRatio")
    private Integer defectRatio;
}
