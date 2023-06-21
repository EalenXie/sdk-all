package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/4/4 9:08
 */
@Getter
@Setter
public class Proposals {
    @JsonProperty("date")
    private String date;
    @JsonProperty("minTime")
    private String minTime;
    @JsonProperty("maxTime")
    private String maxTime;
}
