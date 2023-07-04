package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 11:07
 * @version 1.0
 */
@Getter
@Setter
public class Phones {
    /**
     * number
     */
    @JsonProperty("number")
    private String number;
}
