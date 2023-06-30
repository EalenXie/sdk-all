package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 16:17
 */
@NoArgsConstructor
@Data
public class PromoModifyDetailResult {
    /**
     * tasks
     */
    @JsonProperty("tasks")
    private List<PromoModifyTask> tasks;
    /**
     * modification
     */
    @JsonProperty("modification")
    private PromoModify modification;
    /**
     * additionalMarketplaces
     */
    @JsonProperty("additionalMarketplaces")
    private List<PromoModifyDetailAdditionalMarketplaces> additionalMarketplaces;
}
