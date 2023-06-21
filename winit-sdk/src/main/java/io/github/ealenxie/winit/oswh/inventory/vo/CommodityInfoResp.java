package io.github.ealenxie.winit.oswh.inventory.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/1/28 15:56
 * @version 1.0
 */
@Getter
@Setter
public class CommodityInfoResp {
    @JsonProperty("pageParams")
    private WinItInventoryPage pageParams;
    @JsonProperty("list")
    private List<CommodityInfo> list;
}
