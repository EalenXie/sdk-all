package io.github.ealenxie.alyunwms.vo.asn;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/22 16:56
 * @version 1.0
 */
@Getter
@Setter
public class BoxInfo {
    /**
     * 箱子号
     */
    @JsonProperty("box_no")
    private String boxNo;
    /**
     * 箱子长；默认单位：CM
     */
    @JsonProperty("box_length")
    private String boxLength;
    /**
     * 箱子宽；默认单位：CM
     */
    @JsonProperty("box_width")
    private String boxWidth;
    /**
     * 箱子高；默认单位：CM
     */
    @JsonProperty("box_height")
    private String boxHeight;
    /**
     * 箱子重量；默认单位：KG
     */
    @JsonProperty("box_weight")
    private String boxWeight;
}
