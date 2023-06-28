package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EptVerification {
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
    /**
     * 验证结果
     */
    @JsonProperty("reasons")
    private List<Reason> reasons;
}