package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 20:36
 */
@Getter
@Setter
public class ContentData {
    /**
     * 运单信息
     */
    @JsonProperty("logisticsOrder")
    private LogisticsOrder logisticsOrder;

    /**
     * 包裹信息
     */
    @JsonProperty("parcelList")
    private List<Parcel> parcelList;
}
