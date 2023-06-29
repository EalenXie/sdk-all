package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 15:39
 */
@NoArgsConstructor
@Data
public class Allegrocz {
    /**
     * publication
     */
    @JsonProperty("publication")
    private AllegroczPublication publication;
    /**
     * sellingMode
     */
    @JsonProperty("sellingMode")
    private AllegroczSellingMode sellingMode;
    /**
     * stats
     */
    @JsonProperty("stats")
    private Stats stats;
    /**
     * stock
     */
    @JsonProperty("stock")
    private Stock stock;
}
