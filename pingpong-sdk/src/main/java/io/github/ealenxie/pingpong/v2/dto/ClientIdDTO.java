package io.github.ealenxie.pingpong.v2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/8 15:17
 * @version 1.0
 */
@Getter
@Setter
public class ClientIdDTO {
    /**
     * 客户ID
     */
    @JsonProperty("clientId")
    private String clientId;

    public ClientIdDTO(String clientId) {
        this.clientId = clientId;
    }
}
