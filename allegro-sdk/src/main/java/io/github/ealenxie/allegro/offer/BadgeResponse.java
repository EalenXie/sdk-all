package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/5 10:02
 * @version 1.0
 */
@Getter
@Setter
public class BadgeResponse {

    /**
     * badges
     */
    @JsonProperty("badges")
    private List<Badges> badges;
}
