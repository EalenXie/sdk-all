package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 16:31
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClaimCodePayload {

    /**
     * 认领单号
     */
    @JsonProperty("claim_code")
    private String claimCode;
}
