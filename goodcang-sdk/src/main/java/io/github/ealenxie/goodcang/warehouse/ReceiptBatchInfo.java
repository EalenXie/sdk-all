package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 13:02
 */
@Getter
@Setter
public class ReceiptBatchInfo {
    /**
     * 尾程仓收货批次
     */
    @JsonProperty("gc_receiving_data")
    private List<GcReceivingData> gcReceivingData;
    /**
     * 中转仓收货批次(箱子)
     */
    @JsonProperty("transit_box_data")
    private List<TransitBoxData> transitBoxData;
    /**
     * 中转仓收货批次(商品)
     */
    @JsonProperty("transit_data")
    private List<GcReceivingData> transitData;

}
