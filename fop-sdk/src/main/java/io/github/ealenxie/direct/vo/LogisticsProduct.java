package io.github.ealenxie.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 13:04
 */
@Getter
@Setter
public class LogisticsProduct {


    @JsonProperty("billing_volume_weight")
    private String billingVolumeWeight;
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;
    @JsonProperty("logistics_product_name_cn")
    private String logisticsProductNameCn;
    @JsonProperty("logistics_product_name_en")
    private String logisticsProductNameEn;
    @JsonProperty("order_track")
    private String orderTrack;
    @JsonProperty("surface_mail")
    private String surfaceMail;
    @JsonProperty("transport_mode")
    private String transportMode;
    @JsonProperty("with_battery")
    private String withBattery;
}
