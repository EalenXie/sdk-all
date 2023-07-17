package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 10:20
 */
@Getter
@Setter
public class ReturnGoodItemCode {
    /**
     * handleMethod
     */
    @JsonProperty("handleMethod")
    private String handleMethod;
    /**
     * itemCode
     */
    @JsonProperty("itemCode")
    private String itemCode;
}
