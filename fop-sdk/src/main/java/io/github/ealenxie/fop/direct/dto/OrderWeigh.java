package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/24 17:56
 */
@Getter
@Setter
public class OrderWeigh {
    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("requestNo")
    private String requestNo;
    @JsonProperty("pieces")
    private Integer pieces;
    @JsonProperty("parcelList")
    private List<OrderParcel> parcelList;
}
