package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 10:08
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IoCodePayload {

    /**
     * 查件单号
     */
    @JsonProperty("io_code")
    private String ioCode;
}
