package io.github.ealenxie.edayun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LockInventoryDTO {


    /**
     * 需要锁定的SKU信息,产品的ID以及锁定数量。
     */
    @JsonProperty("skuInfo")
    private List<SkuInfoDTO> skuInfo;

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
