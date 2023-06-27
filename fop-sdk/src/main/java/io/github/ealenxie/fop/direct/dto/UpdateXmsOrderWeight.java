package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 13:16
 */
@Getter
@Setter
public class UpdateXmsOrderWeight {
    /**
     * 请求单号(支持4PX单号/客户单号/服务商单号)
     */
    @JsonProperty("request_no")
    private String requestNo;

    /**
     * 预报重量（g）
     */
    @JsonProperty("weight")
    private String weight;

    /**
     * 包裹列表
     */
    @JsonProperty("parcelist")
    private List<ParcelPayload> parcelist;
}
