package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/18 13:30
 */
@Getter
@Setter
public class EventStats {


    @JsonProperty("latestEvent")
    private LatestEvent latestEvent;

}
