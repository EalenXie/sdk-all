package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author EalenXie created on 2023/6/26 13:50
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReferenceNoPayload {
    /**
     * 参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
}
