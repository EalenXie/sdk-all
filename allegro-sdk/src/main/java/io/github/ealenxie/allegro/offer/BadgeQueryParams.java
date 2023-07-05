package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 10:00
 * @version 1.0
 */
@Getter
@Setter
public class BadgeQueryParams extends PageQueryParams {
    @JsonProperty("offer.id")
    private String offerId;
}
