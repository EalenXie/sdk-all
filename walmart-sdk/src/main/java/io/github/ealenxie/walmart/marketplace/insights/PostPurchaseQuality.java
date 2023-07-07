package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:53
 */
@Getter
@Setter
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
