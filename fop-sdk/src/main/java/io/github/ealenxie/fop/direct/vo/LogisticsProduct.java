package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 13:04
 */
@Getter
@Setter
public class LogisticsProduct {

    /**
     * 体积重参与计费（Y：参加；N：不参与）
     */
    @JsonProperty("billing_volume_weight")
    private String billingVolumeWeight;

    /**
     * 物流产品代码
     */
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;

    /**
     * 物流产品中文名称
     */
    @JsonProperty("logistics_product_name_cn")
    private String logisticsProductNameCn;

    /**
     * 物流产品英文名称
     */
    @JsonProperty("logistics_product_name_en")
    private String logisticsProductNameEn;

    /**
     * 是否可跟踪（Y：可跟踪；N：不可跟踪）
     */
    @JsonProperty("order_track")
    private String orderTrack;

    /**
     * 是否是平邮（Y：平邮；N：非平邮）
     */
    @JsonProperty("surface_mail")
    private String surfaceMail;

    /**
     * 运输方式：
     * <p>
     * 2 国际快递；
     * <p>
     * 3 国际小包；
     * <p>
     * 4 专线；
     * <p>
     * 5 联邮通；
     * <p>
     * 6 其他；
     */
    @JsonProperty("transport_mode")
    private String transportMode;

    /**
     * 是否可带电（Y：可带电；N：不可带电）
     */
    @JsonProperty("with_battery")
    private String withBattery;
}
