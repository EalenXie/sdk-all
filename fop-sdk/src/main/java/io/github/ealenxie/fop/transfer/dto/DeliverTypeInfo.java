package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class DeliverTypeInfo {
    /**
     * 收货方式
     * <p>
     * 上门揽收：1；快递到仓：2；自送到仓:3；自送站点：5
     */
    @JsonProperty("deliverType")
    private String deliverType;

    /**
     * 收货仓库/门店代码
     * <p>
     * 2,3,4,5必填
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;

    /**
     * 上门揽收信息
     */
    @JsonProperty("pickUpInfo")
    private PickUpInfo pickUpInfo;

    /**
     * 快递到仓信息
     */
    @JsonProperty("expressToFpxInfo")
    private ExpressToFpxInfo expressToFpxInfo;

    /**
     * 自己送仓信息
     */
    @JsonProperty("selfSendToFpxInfo")
    private SelfSendToFpxInfo selfSendToFpxInfo;
}
