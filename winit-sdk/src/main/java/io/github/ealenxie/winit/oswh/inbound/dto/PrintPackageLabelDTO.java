package io.github.ealenxie.winit.oswh.inbound.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/3/25 17:40
 * @version 1.0
 */
@Getter
@Setter
public class PrintPackageLabelDTO {

    /**
     * Winit订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * 打印尺寸
     * 单位：cm
     * 10x10
     * 10x6
     * 15x10 目前只有3种规格
     */
    @JsonProperty("labelSize")
    private String labelSize;
    /**
     * 只能传Made in China或Made in Taiwan,China
     */
    @JsonProperty("origin")
    private String origin;
    /**
     * 包裹列表，如下为包裹子节点。说明：每次打印包裹数量限制为50个，若超过请分批调用
     */
    @JsonProperty("packageNoList")
    private List<PackageNoDTO> packageNoList;
}
