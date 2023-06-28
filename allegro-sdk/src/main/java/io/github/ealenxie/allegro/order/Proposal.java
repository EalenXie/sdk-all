package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/4 9:08
 */
@Getter
@Setter
public class Proposal {
    @JsonProperty("date")
    private String date;
    @JsonProperty("minTime")
    private String minTime;
    @JsonProperty("maxTime")
    private String maxTime;
}
