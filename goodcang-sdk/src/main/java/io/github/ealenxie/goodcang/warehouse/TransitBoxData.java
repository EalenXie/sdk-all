package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/26 13:05
 */
@NoArgsConstructor
@Data
public class TransitBoxData {
    /**
     * 箱子高度
     */
    @JsonProperty("box_height")
    private Integer boxHeight;
    /**
     * 箱子高度
     */
    @JsonProperty("box_length")
    private Integer boxLength;
    /**
     * 入库单箱号
     */
    @JsonProperty("box_no")
    private String boxNo;
    /**
     * 箱子重量
     */
    @JsonProperty("box_weight")
    private Integer boxWeight;
    /**
     * 箱子宽度
     */
    @JsonProperty("box_width")
    private Integer boxWidth;
    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
}
