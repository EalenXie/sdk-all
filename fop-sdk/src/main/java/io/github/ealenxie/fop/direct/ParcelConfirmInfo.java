package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/21 13:15
 */
@Getter
@Setter
public class ParcelConfirmInfo {
    /**
     * 订单的实际包裹数
     */
    @JsonProperty("confirm_parcel_qty")
    private String confirmParcelQty;

    /**
     * 订单实重（默认g）
     */
    @JsonProperty("confirm_parcel_weight")
    private Integer confirmParcelWeight;

    /**
     * 包裹列表
     */
    @JsonProperty("parcel_list_confirm_info")
    private List<ParcelListConfirmInfo> parcelListConfirmInfo;
}
