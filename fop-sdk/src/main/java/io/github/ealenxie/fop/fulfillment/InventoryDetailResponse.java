package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月27日 0027 09 01
 */
@Getter
@Setter
public class InventoryDetailResponse {
    /**
     * 库存信息集合
     */
    @JsonProperty("inventorydetaillist")
    private List<InventoryDetail> inventoryDetails;

}
