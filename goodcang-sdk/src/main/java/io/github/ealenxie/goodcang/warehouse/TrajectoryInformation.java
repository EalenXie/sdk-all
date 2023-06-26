package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 14:15
 */
@NoArgsConstructor
@Data
public class TrajectoryInformation {
    /**
     * 跟踪号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;
    /**
     * 轨迹信息
     */
    @JsonProperty("item")
    private List<TrajectoryItem> item;
}
