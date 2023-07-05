package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/5 10:18
 * @version 1.0
 */
@Getter
@Setter
public class BadgeApplicationResponse {
    /**
     * badgeApplications
     */
    @JsonProperty("badgeApplications")
    List<CreateBadgeResponse> badgeApplications;
}
