package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 9:53
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReceivingCodePayload {

    /**
     * 入库单单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
}
