package io.github.ealenxie.pingpong.v2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/8 15:45
 * @version 1.0
 */
@Getter
@Setter
public class StoreInfoDTO extends PageDTO {

    /**
     * 客户id
     */
    @JsonProperty("clientId")
    private String clientId;
    /**
     * 平台
     */
    @JsonProperty("platform")
    private String platform;

}
