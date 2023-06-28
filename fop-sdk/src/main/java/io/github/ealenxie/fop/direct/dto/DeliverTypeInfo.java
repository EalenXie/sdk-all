package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class DeliverTypeInfo {
    /**
     * 到仓方式
     * <p>
     * 1:上门揽收；2:快递到仓；3:自送到仓；5:自送门店
     */
    @JsonProperty("deliver_type")
    private String deliverType;

    /**
     * 收货仓库/门店代码（仓库代码）
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

    /**
     * 上门揽收信息
     */
    @JsonProperty("pick_up_info")
    private PickUpInfo pickUpInfo;

    /**
     * 快递到仓信息
     */
    @JsonProperty("express_to_4px_info")
    private ExpressTo4pxInfo expressTo4pxInfo;

    /**
     * 自己送仓信息
     */
    @JsonProperty("self_send_to_4px_info")
    private SelfSendTo4pxInfo selfSendTo4pxInfo;
}
