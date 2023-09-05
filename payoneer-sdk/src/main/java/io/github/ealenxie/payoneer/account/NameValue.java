package io.github.ealenxie.payoneer.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/30 12:43
 */
@Getter
@Setter
public class NameValue {
    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;
}
