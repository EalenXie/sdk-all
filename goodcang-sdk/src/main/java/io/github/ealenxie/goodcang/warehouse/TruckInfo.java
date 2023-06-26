package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 卡派渠道物流信息
 *
 * @author zhs
 */
@Getter
@Setter
public class TruckInfo {
    /**
     * 参考号
     */
    @JsonProperty("reference_id")
    private String referenceId;

    /**
     * 店铺名称
     */
    @JsonProperty("seller_name")
    private String sellerName;

    /**
     * FBA仓库代码
     */
    @JsonProperty("fba_warehouse_code")
    private String fbaWarehouseCode;


}