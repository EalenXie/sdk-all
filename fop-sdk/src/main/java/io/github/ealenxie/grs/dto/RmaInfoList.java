package io.github.ealenxie.grs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/2 12:32
 */
@Getter
@Setter
public class RmaInfoList {

    @JsonProperty("page_count")
    private Integer pageCount;
    @JsonProperty("page_start")
    private Integer pageStart;
    @JsonProperty("received_shipping_no")
    private String receivedShippingNo;
    @JsonProperty("recevier_time_end")
    private String recevierTimeEnd;
    @JsonProperty("recevier_time_start")
    private String recevierTimeStart;
    @JsonProperty("rma_no")
    private String rmaNo;
}
