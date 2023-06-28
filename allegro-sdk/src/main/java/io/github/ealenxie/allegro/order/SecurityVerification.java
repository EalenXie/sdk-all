package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SecurityVerification {
    /**
     * "ACCEPTED" "REJECTED" "WAITING"
     */
    @JsonProperty("status")
    private String status;
    /**
     * 验证时间
     */
    @JsonProperty("verifiedAt")
    private String verifiedAt;
}