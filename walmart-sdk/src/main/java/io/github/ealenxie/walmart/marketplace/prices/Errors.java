package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/7 17:13
 * @version 1.0
 */
@Getter
@Setter
public class Errors {
    /**
     * errorMessage
     */
    @JsonProperty("errorMessage")
    private String errorMessage;
}
