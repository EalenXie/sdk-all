package io.github.ealenxie.fop.direct;

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

    /**
     * 请求id
     */
    @JsonProperty("requestId")
    private String requestId;

    /**
     * 请求单号
     */
    @JsonProperty("requestNo")
    private String requestNo;

    /**
     * 外包装件数
     */
    @JsonProperty("pieces")
    private Integer pieces;

    /**
     * 件数序列
     */
    @JsonProperty("parcelList")
    private List<OrderParcel> parcelList;
}
