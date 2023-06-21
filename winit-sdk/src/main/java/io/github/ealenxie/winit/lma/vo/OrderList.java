package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 15:18
 * @version 1.0
 */
@Getter
@Setter
public class OrderList {
    /**
     * Winit订单号
     */
    @JsonProperty("winitOrderNo")
    private String winitOrderNo;
    /**
     * 包裹列表
     */
    @JsonProperty("packageLabels")
    private List<PackageLabel> packageLabels;
}
