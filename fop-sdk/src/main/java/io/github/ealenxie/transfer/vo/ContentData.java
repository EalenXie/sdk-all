package io.github.ealenxie.transfer.vo;

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
    @JsonProperty("logisticsOrder")
    private LogisticsOrder logisticsOrder;
    @JsonProperty("parcelList")
    private List<Parcel> parcelList;
}
