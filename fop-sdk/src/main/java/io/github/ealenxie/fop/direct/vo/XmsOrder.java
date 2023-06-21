package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:14
 */
@Getter
@Setter
public class XmsOrder {

    @JsonProperty("consignment_info")
    private ConsignmentInfo consignmentInfo;
    @JsonProperty("parcel_confirm_info")
    private ParcelConfirmInfo parcelConfirmInfo;
}
