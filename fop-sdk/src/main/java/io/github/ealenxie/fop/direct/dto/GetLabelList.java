package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/24 17:50
 */
@Getter
@Setter
public class GetLabelList {


    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("requestNos")
    private List<String> requestNos;
}
