package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 15:49
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AsroCodePayload {
    /**
     * 退件号
     */
    @JsonProperty("asro_code")
    private String asroCode;
}
