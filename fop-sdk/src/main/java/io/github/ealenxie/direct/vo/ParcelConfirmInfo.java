package io.github.ealenxie.direct.vo;

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
    @JsonProperty("confirm_parcel_qty")
    private String confirmParcelQty;
    @JsonProperty("confirm_parcel_weight")
    private Integer confirmParcelWeight;
    @JsonProperty("parcel_list_confirm_info")
    private List<ParcelListConfirmInfo> parcelListConfirmInfo;
}
