package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 16:49
 * @version 1.0
 */
@Getter
@Setter
public class LabelList {
    /**
     * 订单单号
     */
    @JsonProperty("winitOrderNo")
    private String winitOrderNo;
    /**
     * 订单包裹的面单列表
     */
    @JsonProperty("packageLabels")
    private List<PackageLabels> packageLabels;
}
