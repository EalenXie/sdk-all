package io.github.ealenxie.wish.currencies;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 13:28
 */
@Getter
@Setter
public class Currency {

    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
}
