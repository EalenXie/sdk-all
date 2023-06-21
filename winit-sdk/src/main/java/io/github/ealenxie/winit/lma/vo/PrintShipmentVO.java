package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 15:05
 * @version 1.0
 */
@Getter
@Setter
public class PrintShipmentVO {

    /**
     * 面单列表
     */
    @JsonProperty("labelList")
    private List<LabelVO> labelList;
}
