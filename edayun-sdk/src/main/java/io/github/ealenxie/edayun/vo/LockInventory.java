package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LockInventory {

    @JsonProperty("skuInfo")
    private List<SkuInfo> skuInfo;

    /**
     * 仓库ID
     */
    @JsonProperty("warehouseId")
    private Integer warehouseId;

    /**
     * 平台单号
     */
    @JsonProperty("channelOrder")
    private String channelOrder;

}
