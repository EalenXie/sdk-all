package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 11:40
 */
@Getter
@Setter
public class CreatBatchOutboundResp {


    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("departureCode")
    private String departureCode;
}
