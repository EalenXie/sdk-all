package io.github.ealenxie.fop.direct;

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

    /**
     * 请求id
     */
    @JsonProperty("requestId")
    private String requestId;

    /**
     * 请求单号集合
     */
    @JsonProperty("requestNos")
    private List<String> requestNos;
}
