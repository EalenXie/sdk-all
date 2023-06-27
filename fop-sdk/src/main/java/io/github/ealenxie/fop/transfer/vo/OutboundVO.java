package io.github.ealenxie.fop.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 19:57
 */
@Getter
@Setter
public class OutboundVO {
    /**
     * 末端服务商单号
     */
    private String deliveryCompanyBarcode;

    /**
     * 末端服务商
     */
    private String logisticsChannelName;

    /**
     * 包裹重量
     */
    private String weight;

    /**
     * 计费重
     */
    @JsonProperty("billing_weight")
    private String billingWeight;

    /**
     * 重量单位
     */
    private String weightUnit;

    /**
     * 所在仓库
     */
    private String warehouseName;


}
