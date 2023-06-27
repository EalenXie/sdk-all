package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 11:31
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WisCodePayload {

    /**
     * 仓租单号
     */
    @JsonProperty("wis_code")
    private String wisCode;
}
