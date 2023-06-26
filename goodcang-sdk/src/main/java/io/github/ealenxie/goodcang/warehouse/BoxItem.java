package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 9:50
 */
@Getter
@Setter
public class BoxItem {
    /**
     * 箱唛参考号
     */
    @JsonProperty("reference_box_no")
    private String referenceBoxNo;
    /**
     * 箱号
     */
    @JsonProperty("box_no")
    private Integer boxNo;
    /**
     * 箱子信息
     */
    @JsonProperty("box_details")
    private List<BoxDetail> boxDetails;
}
