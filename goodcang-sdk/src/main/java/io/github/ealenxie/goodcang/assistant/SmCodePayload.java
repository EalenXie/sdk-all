package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 10:01
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SmCodePayload {
    /**
     * 物流方式编码
     */
    @JsonProperty("sm_code")
    private String smCode;
}
