package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 小小怪下士
 * @version 1.0.0
 */
@Getter
@Setter
public class Email {
    @JsonProperty("value")
    private String value;
    @JsonProperty("primary")
    private Boolean primary;
}
