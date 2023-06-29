package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/28 14:30
 */
@Getter
@Setter
public class PcsOrderQuery {

    /**
     * 4px跟踪号
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 订单类型
     * <p>
     * inbound ：入库；
     * <p>
     * outbound：出库
     */
    @JsonProperty("orderType")
    private String orderType;
}
