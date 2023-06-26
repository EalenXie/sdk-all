package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 15:25
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReturnOrderDiscardPayload {

    /**
     * 退件单号
     */
    @JsonProperty("ro_code")
    private String roCode;
    /**
     * 退件原因
     */
    @JsonProperty("new_desc")
    private String newDesc;
}
