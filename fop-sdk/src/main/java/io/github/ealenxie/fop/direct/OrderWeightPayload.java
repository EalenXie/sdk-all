package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 11:39
 */

@Getter
@Setter
public class OrderWeightPayload {
    /**
     * 单号
     */
    @JsonProperty("orderNo")
    private String orderNo;

    /**
     * 订单重量（单位:g）
     */
    @JsonProperty("weight")
    private String weight;

}
