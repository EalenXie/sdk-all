package io.github.ealenxie.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 12:33
 */
@Getter
@Setter
public class DepartureCodeResp {


    @JsonProperty("departure_code")
    private String departureCode;
    @JsonProperty("request_id")
    private String requestId;
}
