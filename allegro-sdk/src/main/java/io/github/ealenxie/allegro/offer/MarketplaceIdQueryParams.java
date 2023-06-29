package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 16:09
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MarketplaceIdQueryParams {

    @JsonProperty("marketplaceId")
    private String marketplaceId;
}
