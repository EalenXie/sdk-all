package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/17 10:20
 */
@NoArgsConstructor
@Data
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
