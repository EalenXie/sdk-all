package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/3/27 11:21
 * @version 1.0
 */
@Getter
@Setter
public class PrintProductLabelPayload {
    /**
     * 单品信息数据数组
     */
    @JsonProperty("singleItems")
    private List<SingleItem> singleItems;
    /**
     * 条码尺寸类型
     * LZ10060：100x60mm（建议）；
     * LZ7050：70x50mm；
     * LZ6040:60x40mm
     * 仅返回指定尺寸的单品条码，
     */
    @JsonProperty("labelType")
    private String labelType;
    /**
     * 选择产地,
     * None:不显示信息在条码
     * China:显示make in china
     */
    @JsonProperty("madeIn")
    private String madeIn;
    /**
     * Y\N，不传默认为N
     * Y：打印的条码中，带有欧代信息。（前提是维护了欧代信息）。
     * N：打印的条码不变，不带有欧代信息。
     */
    @JsonProperty("isEar")
    private String isEar;
}
